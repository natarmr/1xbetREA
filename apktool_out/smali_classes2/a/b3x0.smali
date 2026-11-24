.class public final La/b3x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dnw0;


# instance fields
.field public final a:La/dnw0;

.field public final b:[B


# direct methods
.method public constructor <init>(La/dnw0;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b3x0;->a:La/dnw0;

    .line 5
    .line 6
    iput-object p2, p0, La/b3x0;->b:[B

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 2

    .line 1
    iget-object p2, p0, La/b3x0;->b:[B

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, La/b3x0;->a:La/dnw0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, p1, v1}, La/dnw0;->b([B[B)[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p2, p1}, La/x7x0;->b([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    array-length p2, p2

    .line 21
    array-length v0, p1

    .line 22
    invoke-static {p1, p2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, p1, v1}, La/dnw0;->b([B[B)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const-string p0, "Invalid ciphertext (output prefix mismatch)"

    .line 32
    .line 33
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method
