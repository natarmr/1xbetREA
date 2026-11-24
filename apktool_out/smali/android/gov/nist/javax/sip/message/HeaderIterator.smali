.class public Landroid/gov/nist/javax/sip/message/HeaderIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field private index:I

.field private sipHeader:Landroid/gov/nist/javax/sip/header/SIPHeader;

.field private sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;

.field private toRemove:Z


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/gov/nist/javax/sip/header/SIPHeader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipHeader:Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public hasNext()Z
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public hasPrevious()Z
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipHeader:Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->toRemove:Z

    .line 11
    .line 12
    iput v2, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-static {}, La/itt0;->a()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public nextIndex()I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public previous()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipHeader:Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->toRemove:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {}, La/itt0;->a()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public previousIndex()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->index:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public remove()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipHeader:Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->toRemove:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipHeader:Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 11
    .line 12
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/HeaderIterator;->sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {}, La/v4i0;->e()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-static {}, La/v4i0;->e()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method
