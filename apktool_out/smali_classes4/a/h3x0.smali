.class public final La/h3x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dnw0;


# instance fields
.field public final a:La/b7x0;


# direct methods
.method public constructor <init>(La/b7x0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/h3x0;->a:La/b7x0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 1

    .line 1
    iget-object p0, p0, La/h3x0;->a:La/b7x0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/b7x0;->a([B)Ljava/lang/Iterable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :catch_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, La/j3x0;

    .line 23
    .line 24
    :try_start_0
    iget-object p2, p2, La/j3x0;->a:La/dnw0;

    .line 25
    .line 26
    invoke-interface {p2, p1, v0}, La/dnw0;->b([B[B)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "decryption failed"

    .line 32
    .line 33
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method
