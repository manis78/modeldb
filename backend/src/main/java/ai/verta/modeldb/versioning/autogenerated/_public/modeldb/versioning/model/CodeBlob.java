// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import java.util.*;
import java.util.function.Function;

public class CodeBlob implements ProtoType {
  public Optional<GitCodeBlob> Git;
  public Optional<NotebookCodeBlob> Notebook;

  public CodeBlob() {
    this.Git = Optional.empty();
    this.Notebook = Optional.empty();
  }

  public Boolean isEmpty() {
    if (this.Git.isPresent()) {
      return false;
    }
    if (this.Notebook.isPresent()) {
      return false;
    }
    return true;
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof CodeBlob)) return false;
    CodeBlob other = (CodeBlob) o;

    {
      Function3<GitCodeBlob, GitCodeBlob, Boolean> f = (x, y) -> x.equals(y);
      if (this.Git.isPresent() || other.Git.isPresent()) {
        if (!this.Git.isPresent()) return false;
        if (other.Git.isPresent()) return false;
        if (!f.apply(this.Git.get(), other.Git.get())) return false;
      }
    }
    {
      Function3<NotebookCodeBlob, NotebookCodeBlob, Boolean> f = (x, y) -> x.equals(y);
      if (this.Notebook.isPresent() || other.Notebook.isPresent()) {
        if (!this.Notebook.isPresent()) return false;
        if (other.Notebook.isPresent()) return false;
        if (!f.apply(this.Notebook.get(), other.Notebook.get())) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.Git, this.Notebook);
  }

  public CodeBlob setGit(Optional<GitCodeBlob> value) {
    this.Git = value;
    return this;
  }

  public CodeBlob setGit(GitCodeBlob value) {
    if (value == null) this.Git = Optional.empty();
    else this.Git = Optional.of(value);
    return this;
  }

  public CodeBlob setNotebook(Optional<NotebookCodeBlob> value) {
    this.Notebook = value;
    return this;
  }

  public CodeBlob setNotebook(NotebookCodeBlob value) {
    if (value == null) this.Notebook = Optional.empty();
    else this.Notebook = Optional.of(value);
    return this;
  }

  public static CodeBlob fromProto(ai.verta.modeldb.versioning.CodeBlob blob) {
    if (blob == null) {
      return null;
    }

    CodeBlob obj = new CodeBlob();
    {
      Function<ai.verta.modeldb.versioning.CodeBlob, GitCodeBlob> f =
          x -> GitCodeBlob.fromProto(blob.getGit());
      obj.Git = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.CodeBlob, NotebookCodeBlob> f =
          x -> NotebookCodeBlob.fromProto(blob.getNotebook());
      obj.Notebook = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.CodeBlob.Builder toProto() {
    ai.verta.modeldb.versioning.CodeBlob.Builder builder =
        ai.verta.modeldb.versioning.CodeBlob.newBuilder();
    this.Git.ifPresent(x -> builder.setGit(x.toProto()));
    this.Notebook.ifPresent(x -> builder.setNotebook(x.toProto()));
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitCodeBlob(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    if (this.Git.isPresent()) visitor.preVisitDeepGitCodeBlob(this.Git.get());
    if (this.Notebook.isPresent()) visitor.preVisitDeepNotebookCodeBlob(this.Notebook.get());
  }

  public CodeBlob postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitCodeBlob(this);
  }

  public CodeBlob postVisitDeep(Visitor visitor) throws ModelDBException {
    if (this.Git.isPresent()) this.setGit(visitor.postVisitDeepGitCodeBlob(this.Git.get()));
    if (this.Notebook.isPresent())
      this.setNotebook(visitor.postVisitDeepNotebookCodeBlob(this.Notebook.get()));
    return this.postVisitShallow(visitor);
  }
}