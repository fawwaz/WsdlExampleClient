
package com.github.fawwaz.heroku.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.fawwaz.heroku.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateCommentResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "createCommentResponse");
    private final static QName _InterruptedException_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "InterruptedException");
    private final static QName _CreatePost_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "createPost");
    private final static QName _SayHi_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "sayHi");
    private final static QName _ReadCommentResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "readCommentResponse");
    private final static QName _PublishPostResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "publishPostResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "deleteUserResponse");
    private final static QName _DeleteCommentResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "deleteCommentResponse");
    private final static QName _SayHiResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "sayHiResponse");
    private final static QName _ReadComment_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "readComment");
    private final static QName _CreateUserResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "createUserResponse");
    private final static QName _SearchPostResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "searchPostResponse");
    private final static QName _DeletePostResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "deletePostResponse");
    private final static QName _PublishPost_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "publishPost");
    private final static QName _UpdatePostResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "updatePostResponse");
    private final static QName _UpdatePost_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "updatePost");
    private final static QName _DeleteUser_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "deleteUser");
    private final static QName _UpdateUser_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "updateUser");
    private final static QName _CreateUser_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "createUser");
    private final static QName _CreateComment_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "createComment");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "updateUserResponse");
    private final static QName _ReadPostResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "readPostResponse");
    private final static QName _DeletePost_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "deletePost");
    private final static QName _CreatePostResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "createPostResponse");
    private final static QName _ReadUser_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "readUser");
    private final static QName _ReadPost_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "readPost");
    private final static QName _SearchPost_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "searchPost");
    private final static QName _ReadUserResponse_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "readUserResponse");
    private final static QName _DeleteComment_QNAME = new QName("http://service.heroku.fawwaz.github.com/", "deleteComment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.fawwaz.heroku.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdatePostResponse }
     * 
     */
    public UpdatePostResponse createUpdatePostResponse() {
        return new UpdatePostResponse();
    }

    /**
     * Create an instance of {@link PublishPost }
     * 
     */
    public PublishPost createPublishPost() {
        return new PublishPost();
    }

    /**
     * Create an instance of {@link UpdatePost }
     * 
     */
    public UpdatePost createUpdatePost() {
        return new UpdatePost();
    }

    /**
     * Create an instance of {@link ReadComment }
     * 
     */
    public ReadComment createReadComment() {
        return new ReadComment();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link DeletePostResponse }
     * 
     */
    public DeletePostResponse createDeletePostResponse() {
        return new DeletePostResponse();
    }

    /**
     * Create an instance of {@link SearchPostResponse }
     * 
     */
    public SearchPostResponse createSearchPostResponse() {
        return new SearchPostResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link PublishPostResponse }
     * 
     */
    public PublishPostResponse createPublishPostResponse() {
        return new PublishPostResponse();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link DeleteCommentResponse }
     * 
     */
    public DeleteCommentResponse createDeleteCommentResponse() {
        return new DeleteCommentResponse();
    }

    /**
     * Create an instance of {@link CreateCommentResponse }
     * 
     */
    public CreateCommentResponse createCreateCommentResponse() {
        return new CreateCommentResponse();
    }

    /**
     * Create an instance of {@link ReadCommentResponse }
     * 
     */
    public ReadCommentResponse createReadCommentResponse() {
        return new ReadCommentResponse();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link CreatePost }
     * 
     */
    public CreatePost createCreatePost() {
        return new CreatePost();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link ReadUserResponse }
     * 
     */
    public ReadUserResponse createReadUserResponse() {
        return new ReadUserResponse();
    }

    /**
     * Create an instance of {@link SearchPost }
     * 
     */
    public SearchPost createSearchPost() {
        return new SearchPost();
    }

    /**
     * Create an instance of {@link DeleteComment }
     * 
     */
    public DeleteComment createDeleteComment() {
        return new DeleteComment();
    }

    /**
     * Create an instance of {@link DeletePost }
     * 
     */
    public DeletePost createDeletePost() {
        return new DeletePost();
    }

    /**
     * Create an instance of {@link CreatePostResponse }
     * 
     */
    public CreatePostResponse createCreatePostResponse() {
        return new CreatePostResponse();
    }

    /**
     * Create an instance of {@link ReadUser }
     * 
     */
    public ReadUser createReadUser() {
        return new ReadUser();
    }

    /**
     * Create an instance of {@link ReadPostResponse }
     * 
     */
    public ReadPostResponse createReadPostResponse() {
        return new ReadPostResponse();
    }

    /**
     * Create an instance of {@link ReadPost }
     * 
     */
    public ReadPost createReadPost() {
        return new ReadPost();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link CreateComment }
     * 
     */
    public CreateComment createCreateComment() {
        return new CreateComment();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "createCommentResponse")
    public JAXBElement<CreateCommentResponse> createCreateCommentResponse(CreateCommentResponse value) {
        return new JAXBElement<CreateCommentResponse>(_CreateCommentResponse_QNAME, CreateCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "InterruptedException")
    public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
        return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "createPost")
    public JAXBElement<CreatePost> createCreatePost(CreatePost value) {
        return new JAXBElement<CreatePost>(_CreatePost_QNAME, CreatePost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "readCommentResponse")
    public JAXBElement<ReadCommentResponse> createReadCommentResponse(ReadCommentResponse value) {
        return new JAXBElement<ReadCommentResponse>(_ReadCommentResponse_QNAME, ReadCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "publishPostResponse")
    public JAXBElement<PublishPostResponse> createPublishPostResponse(PublishPostResponse value) {
        return new JAXBElement<PublishPostResponse>(_PublishPostResponse_QNAME, PublishPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "deleteCommentResponse")
    public JAXBElement<DeleteCommentResponse> createDeleteCommentResponse(DeleteCommentResponse value) {
        return new JAXBElement<DeleteCommentResponse>(_DeleteCommentResponse_QNAME, DeleteCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "readComment")
    public JAXBElement<ReadComment> createReadComment(ReadComment value) {
        return new JAXBElement<ReadComment>(_ReadComment_QNAME, ReadComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "searchPostResponse")
    public JAXBElement<SearchPostResponse> createSearchPostResponse(SearchPostResponse value) {
        return new JAXBElement<SearchPostResponse>(_SearchPostResponse_QNAME, SearchPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "deletePostResponse")
    public JAXBElement<DeletePostResponse> createDeletePostResponse(DeletePostResponse value) {
        return new JAXBElement<DeletePostResponse>(_DeletePostResponse_QNAME, DeletePostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "publishPost")
    public JAXBElement<PublishPost> createPublishPost(PublishPost value) {
        return new JAXBElement<PublishPost>(_PublishPost_QNAME, PublishPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "updatePostResponse")
    public JAXBElement<UpdatePostResponse> createUpdatePostResponse(UpdatePostResponse value) {
        return new JAXBElement<UpdatePostResponse>(_UpdatePostResponse_QNAME, UpdatePostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "updatePost")
    public JAXBElement<UpdatePost> createUpdatePost(UpdatePost value) {
        return new JAXBElement<UpdatePost>(_UpdatePost_QNAME, UpdatePost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "createComment")
    public JAXBElement<CreateComment> createCreateComment(CreateComment value) {
        return new JAXBElement<CreateComment>(_CreateComment_QNAME, CreateComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "readPostResponse")
    public JAXBElement<ReadPostResponse> createReadPostResponse(ReadPostResponse value) {
        return new JAXBElement<ReadPostResponse>(_ReadPostResponse_QNAME, ReadPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "deletePost")
    public JAXBElement<DeletePost> createDeletePost(DeletePost value) {
        return new JAXBElement<DeletePost>(_DeletePost_QNAME, DeletePost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "createPostResponse")
    public JAXBElement<CreatePostResponse> createCreatePostResponse(CreatePostResponse value) {
        return new JAXBElement<CreatePostResponse>(_CreatePostResponse_QNAME, CreatePostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "readUser")
    public JAXBElement<ReadUser> createReadUser(ReadUser value) {
        return new JAXBElement<ReadUser>(_ReadUser_QNAME, ReadUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "readPost")
    public JAXBElement<ReadPost> createReadPost(ReadPost value) {
        return new JAXBElement<ReadPost>(_ReadPost_QNAME, ReadPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "searchPost")
    public JAXBElement<SearchPost> createSearchPost(SearchPost value) {
        return new JAXBElement<SearchPost>(_SearchPost_QNAME, SearchPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "readUserResponse")
    public JAXBElement<ReadUserResponse> createReadUserResponse(ReadUserResponse value) {
        return new JAXBElement<ReadUserResponse>(_ReadUserResponse_QNAME, ReadUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.fawwaz.github.com/", name = "deleteComment")
    public JAXBElement<DeleteComment> createDeleteComment(DeleteComment value) {
        return new JAXBElement<DeleteComment>(_DeleteComment_QNAME, DeleteComment.class, null, value);
    }

}
