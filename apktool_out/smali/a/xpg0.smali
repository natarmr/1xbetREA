.class public interface abstract La/xpg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# virtual methods
.method public B0()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, La/xpg0;->getLong(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    cmp-long p0, v1, v3

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public abstract J0(I)Ljava/lang/String;
.end method

.method public abstract W0()Z
.end method

.method public abstract getBlob(I)[B
.end method

.method public abstract getColumnCount()I
.end method

.method public abstract getColumnName(I)Ljava/lang/String;
.end method

.method public abstract getDouble(I)D
.end method

.method public abstract getLong(I)J
.end method

.method public abstract i([BI)V
.end method

.method public abstract isNull(I)Z
.end method

.method public abstract o(IJ)V
.end method

.method public abstract p(DI)V
.end method

.method public abstract reset()V
.end method

.method public abstract s(I)V
.end method

.method public abstract t()V
.end method

.method public abstract z(ILjava/lang/String;)V
.end method
