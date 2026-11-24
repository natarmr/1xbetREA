.class public Landroid/gov/nist/javax/sip/message/ContentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/message/Content;


# instance fields
.field private content:Ljava/lang/Object;

.field private contentDispositionHeader:Landroid/javax/sip/header/ContentDispositionHeader;

.field private contentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;

.field private extensionHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/javax/sip/header/Header;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->extensionHeaders:Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->content:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public addExtensionHeader(Landroid/javax/sip/header/Header;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->extensionHeaders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getContent()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->content:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContentDispositionHeader()Landroid/javax/sip/header/ContentDispositionHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->contentDispositionHeader:Landroid/javax/sip/header/ContentDispositionHeader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContentTypeHeader()Landroid/javax/sip/header/ContentTypeHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->contentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getExtensionHeaders()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/javax/sip/header/Header;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->extensionHeaders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public setContent(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->content:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public setContentDispositionHeader(Landroid/javax/sip/header/ContentDispositionHeader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->contentDispositionHeader:Landroid/javax/sip/header/ContentDispositionHeader;

    .line 2
    .line 3
    return-void
.end method

.method public setContentTypeHeader(Landroid/javax/sip/header/ContentTypeHeader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->contentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->contentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->contentDispositionHeader:Landroid/javax/sip/header/ContentDispositionHeader;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->extensionHeaders:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string v1, "\r\n"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/ContentImpl;->content:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
