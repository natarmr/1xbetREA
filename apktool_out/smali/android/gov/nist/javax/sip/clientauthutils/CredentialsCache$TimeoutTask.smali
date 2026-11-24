.class Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache$TimeoutTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TimeoutTask"
.end annotation


# instance fields
.field callId:Ljava/lang/String;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

.field userName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache$TimeoutTask;->this$0:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache$TimeoutTask;->callId:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p2, p0, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache$TimeoutTask;->userName:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public runTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache$TimeoutTask;->this$0:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;->access$000(Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache$TimeoutTask;->callId:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
