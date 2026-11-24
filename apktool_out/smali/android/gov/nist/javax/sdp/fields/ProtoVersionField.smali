.class public Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"

# interfaces
.implements La/vbu0;


# instance fields
.field protected protoVersion:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "v="

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "v="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;->protoVersion:I

    .line 9
    .line 10
    const-string v1, "\r\n"

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getProtoVersion()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;->protoVersion:I

    .line 2
    .line 3
    return p0
.end method

.method public getVersion()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;->getProtoVersion()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public setProtoVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;->protoVersion:I

    .line 2
    .line 3
    return-void
.end method

.method public setVersion(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/ProtoVersionField;->setProtoVersion(I)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string p0, "The value is <0"

    .line 8
    .line 9
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
