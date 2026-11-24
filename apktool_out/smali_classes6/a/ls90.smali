.class public final synthetic La/ls90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:La/j73;

.field public final synthetic c:La/xcz;

.field public final synthetic d:F

.field public final synthetic e:La/vne;

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/a8x;

.field public final synthetic h:La/l7m0;

.field public final synthetic i:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/j73;La/xcz;FLa/vne;La/pz40;La/a8x;La/l7m0;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ls90;->a:La/pz40;

    iput-object p2, p0, La/ls90;->b:La/j73;

    iput-object p3, p0, La/ls90;->c:La/xcz;

    iput p4, p0, La/ls90;->d:F

    iput-object p5, p0, La/ls90;->e:La/vne;

    iput-object p6, p0, La/ls90;->f:La/pz40;

    iput-object p7, p0, La/ls90;->g:La/a8x;

    iput-object p8, p0, La/ls90;->h:La/l7m0;

    iput-object p9, p0, La/ls90;->i:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, La/ls90;->a:La/pz40;

    .line 8
    .line 9
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/a8x;

    .line 14
    .line 15
    iget-object v3, p0, La/ls90;->c:La/xcz;

    .line 16
    .line 17
    iget v4, p0, La/ls90;->d:F

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {v3, v4}, La/ys90;->e(La/xcz;F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, v0, La/a8x;->a:I

    .line 26
    .line 27
    iget v0, v0, La/a8x;->c:I

    .line 28
    .line 29
    invoke-static {v1, p1, v2, v0}, La/ys90;->h(IIII)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :cond_0
    move v8, p1

    .line 34
    iget-object v1, p0, La/ls90;->e:La/vne;

    .line 35
    .line 36
    iget-object v2, p0, La/ls90;->f:La/pz40;

    .line 37
    .line 38
    iget-object v5, p0, La/ls90;->g:La/a8x;

    .line 39
    .line 40
    iget-object v6, p0, La/ls90;->h:La/l7m0;

    .line 41
    .line 42
    iget-object v7, p0, La/ls90;->i:La/pz40;

    .line 43
    .line 44
    iget-object v9, p0, La/ls90;->b:La/j73;

    .line 45
    .line 46
    invoke-static/range {v1 .. v9}, La/ys90;->d(La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;ILa/j73;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0
.end method
