.class public final synthetic La/ks90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/j73;

.field public final synthetic b:La/vne;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/xcz;

.field public final synthetic e:F

.field public final synthetic f:La/a8x;

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/j73;La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ks90;->a:La/j73;

    iput-object p2, p0, La/ks90;->b:La/vne;

    iput-object p3, p0, La/ks90;->c:La/pz40;

    iput-object p4, p0, La/ks90;->d:La/xcz;

    iput p5, p0, La/ks90;->e:F

    iput-object p6, p0, La/ks90;->f:La/a8x;

    iput-object p7, p0, La/ks90;->g:La/l7m0;

    iput-object p8, p0, La/ks90;->h:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v7

    .line 7
    iget-object v0, p0, La/ks90;->b:La/vne;

    .line 8
    .line 9
    iget-object v1, p0, La/ks90;->c:La/pz40;

    .line 10
    .line 11
    iget-object v2, p0, La/ks90;->d:La/xcz;

    .line 12
    .line 13
    iget v3, p0, La/ks90;->e:F

    .line 14
    .line 15
    iget-object v4, p0, La/ks90;->f:La/a8x;

    .line 16
    .line 17
    iget-object v5, p0, La/ks90;->g:La/l7m0;

    .line 18
    .line 19
    iget-object v6, p0, La/ks90;->h:La/pz40;

    .line 20
    .line 21
    iget-object v8, p0, La/ks90;->a:La/j73;

    .line 22
    .line 23
    invoke-static/range {v0 .. v8}, La/ys90;->d(La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;ILa/j73;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
