.class public final La/dii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mct;


# instance fields
.field public final a:La/do20;

.field public final b:La/r9u;

.field public final c:La/n5d0;


# direct methods
.method public constructor <init>(La/kj5;La/r9u;La/htz;La/do20;La/sxs0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/dii;->a:La/do20;

    .line 5
    .line 6
    iput-object p2, p0, La/dii;->b:La/r9u;

    .line 7
    .line 8
    new-instance p1, La/p8i;

    .line 9
    .line 10
    const/4 p2, 0x4

    .line 11
    invoke-direct {p1, p2}, La/p8i;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/dii;->c:La/n5d0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()La/r2t;
    .locals 0

    .line 1
    iget-object p0, p0, La/dii;->c:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r2t;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()La/ddk;
    .locals 0

    .line 1
    new-instance p0, La/ddk;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c()La/oct;
    .locals 5

    .line 1
    new-instance v0, La/oct;

    .line 2
    .line 3
    new-instance v1, La/uxs0;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/uxs0;-><init>(B)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/dii;->a:La/do20;

    .line 11
    .line 12
    iget-object v2, v2, La/do20;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, La/nai;

    .line 15
    .line 16
    new-instance v3, La/mj8;

    .line 17
    .line 18
    iget-object v2, v2, La/nai;->a:La/r9u;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v3, v2, v4}, La/mj8;-><init>(La/r9u;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/bj5;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/dii;->b:La/r9u;

    .line 30
    .line 31
    invoke-direct {v0, v1, v3, v2, p0}, La/oct;-><init>(La/uxs0;La/mj8;La/bj5;La/r9u;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method
