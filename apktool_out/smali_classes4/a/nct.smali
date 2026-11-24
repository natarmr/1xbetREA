.class public final La/nct;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mct;


# instance fields
.field public final synthetic a:La/dii;


# direct methods
.method public constructor <init>(La/kki;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/kki;->e:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v6, v0

    .line 7
    check-cast v6, La/sxs0;

    .line 8
    .line 9
    iget-object v0, p1, La/kki;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v5, v0

    .line 12
    check-cast v5, La/do20;

    .line 13
    .line 14
    iget-object v0, p1, La/kki;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v4, v0

    .line 17
    check-cast v4, La/htz;

    .line 18
    .line 19
    iget-object v0, p1, La/kki;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v3, v0

    .line 22
    check-cast v3, La/r9u;

    .line 23
    .line 24
    iget-object p1, p1, La/kki;->f:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, La/kj5;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v1, La/dii;

    .line 33
    .line 34
    invoke-direct/range {v1 .. v6}, La/dii;-><init>(La/kj5;La/r9u;La/htz;La/do20;La/sxs0;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, La/nct;->a:La/dii;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()La/r2t;
    .locals 0

    .line 1
    iget-object p0, p0, La/nct;->a:La/dii;

    .line 2
    .line 3
    invoke-virtual {p0}, La/dii;->a()La/r2t;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
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
    .locals 0

    .line 1
    iget-object p0, p0, La/nct;->a:La/dii;

    .line 2
    .line 3
    invoke-virtual {p0}, La/dii;->c()La/oct;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
