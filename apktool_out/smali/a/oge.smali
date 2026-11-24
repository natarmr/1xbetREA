.class public final La/oge;
.super La/z1;
.source "SourceFile"


# instance fields
.field public final v:La/mz3;


# direct methods
.method public constructor <init>(La/mz3;La/u12;La/qge;La/a4d;ZLjava/lang/String;La/t4e;)V
    .locals 8

    .line 1
    const/high16 v3, 0x3f800000    # 1.0f

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-object v2, p3

    .line 6
    move-object v4, p4

    .line 7
    move v5, p5

    .line 8
    move-object v6, p6

    .line 9
    move-object v7, p7

    .line 10
    invoke-direct/range {v0 .. v7}, La/z1;-><init>(La/u12;La/qge;FLa/a4d;ZLjava/lang/String;La/t4e;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/oge;->v:La/mz3;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, La/oge;->v:La/mz3;

    .line 6
    .line 7
    iput-object v0, p0, La/mz3;->l:La/vne;

    .line 8
    .line 9
    invoke-virtual {p0}, La/mz3;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final S0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/oge;->v:La/mz3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/mz3;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final T0()V
    .locals 1

    .line 1
    iget-object p0, p0, La/oge;->v:La/mz3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, La/mz3;->n(La/gz3;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final a1()La/pm80;
    .locals 0

    .line 1
    iget-object p0, p0, La/oge;->v:La/mz3;

    .line 2
    .line 3
    return-object p0
.end method
