.class public final La/y9o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/s64;

.field public final b:La/y3v;


# direct methods
.method public constructor <init>(La/s64;La/y3v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y9o0;->a:La/s64;

    .line 5
    .line 6
    iput-object p2, p0, La/y9o0;->b:La/y3v;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/y9o0;->a:La/s64;

    .line 2
    .line 3
    iget-object v0, v0, La/s64;->a:La/s1p;

    .line 4
    .line 5
    const-wide/16 v1, 0x303c

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/y9o0;->b:La/y3v;

    .line 11
    .line 12
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/kt2;

    .line 15
    .line 16
    new-instance v0, La/jo20;

    .line 17
    .line 18
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_0

    .line 26
    .line 27
    const-string v1, "error_code"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "session_error_logout"

    .line 37
    .line 38
    invoke-interface {p0, v0, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
