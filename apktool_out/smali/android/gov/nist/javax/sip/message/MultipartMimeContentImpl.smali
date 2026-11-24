.class public Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/message/MultipartMimeContent;


# static fields
.field public static final BOUNDARY:Ljava/lang/String; = "boundary"


# instance fields
.field private boundary:Ljava/lang/String;

.field private contentList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/gov/nist/javax/sip/message/Content;",
            ">;"
        }
    .end annotation
.end field

.field private headerFactory:Landroid/gov/nist/javax/sip/header/HeaderFactoryExt;

.field private multipartMimeContentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;


# direct methods
.method public constructor <init>(Landroid/javax/sip/header/ContentTypeHeader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->headerFactory:Landroid/gov/nist/javax/sip/header/HeaderFactoryExt;

    .line 17
    .line 18
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->multipartMimeContentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;

    .line 19
    .line 20
    const-string v0, "boundary"

    .line 21
    .line 22
    invoke-interface {p1, v0}, Landroid/javax/sip/header/Parameters;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->boundary:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method private parseBodyPart(Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/ContentImpl;
    .locals 5

    .line 1
    const-string v0, "\n"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "\r\n"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "\r?\n\r?\n"

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    array-length v3, v0

    .line 27
    if-ne v3, v2, :cond_1

    .line 28
    .line 29
    aget-object v2, v0, v1

    .line 30
    .line 31
    const-string v3, "\r?\n"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    aget-object v3, v2, v1

    .line 38
    .line 39
    const-string v4, ":"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-lez v3, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    aget-object p1, v0, p1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 52
    :goto_1
    new-instance v0, Landroid/gov/nist/javax/sip/message/ContentImpl;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Landroid/gov/nist/javax/sip/message/ContentImpl;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    array-length p1, v2

    .line 60
    :goto_2
    if-ge v1, p1, :cond_4

    .line 61
    .line 62
    aget-object v3, v2, v1

    .line 63
    .line 64
    iget-object v4, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->headerFactory:Landroid/gov/nist/javax/sip/header/HeaderFactoryExt;

    .line 65
    .line 66
    invoke-interface {v4, v3}, Landroid/gov/nist/javax/sip/header/HeaderFactoryExt;->createHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    instance-of v4, v3, Landroid/javax/sip/header/ContentTypeHeader;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    check-cast v3, Landroid/javax/sip/header/ContentTypeHeader;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/ContentImpl;->setContentTypeHeader(Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    instance-of v4, v3, Landroid/javax/sip/header/ContentDispositionHeader;

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    check-cast v3, Landroid/javax/sip/header/ContentDispositionHeader;

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/ContentImpl;->setContentDispositionHeader(Landroid/javax/sip/header/ContentDispositionHeader;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/ContentImpl;->addExtensionHeader(Landroid/javax/sip/header/Header;)V

    .line 91
    .line 92
    .line 93
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    return-object v0
.end method


# virtual methods
.method public add(Landroid/gov/nist/javax/sip/message/Content;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 2
    .line 3
    check-cast p1, Landroid/gov/nist/javax/sip/message/ContentImpl;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public addContent(Landroid/gov/nist/javax/sip/message/Content;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->add(Landroid/gov/nist/javax/sip/message/Content;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public createContentList(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->boundary:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Ljava/util/Scanner;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/util/Scanner;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "\r?\n?--"

    .line 13
    .line 14
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->boundary:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "(--)?\r?\n?"

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 32
    .line 33
    .line 34
    :catch_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/Scanner;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->parseBodyPart(Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/ContentImpl;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void

    .line 55
    :cond_1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->parseBodyPart(Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/ContentImpl;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->getContentTypeHeader()Landroid/javax/sip/header/ContentTypeHeader;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/ContentImpl;->setContentTypeHeader(Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public getContentCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getContentTypeHeader()Landroid/javax/sip/header/ContentTypeHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->multipartMimeContentTypeHeader:Landroid/javax/sip/header/ContentTypeHeader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContents()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/gov/nist/javax/sip/message/Content;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

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

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v3, "--"

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/gov/nist/javax/sip/message/Content;

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->boundary:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v3, "\r\n"

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/message/Content;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->contentList:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->boundary:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method
