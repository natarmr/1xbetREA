.class public final synthetic La/u2w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;La/l7m0;FFII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u2w;->a:La/mm40;

    iput-object p2, p0, La/u2w;->b:La/l7m0;

    iput-object p3, p0, La/u2w;->c:La/l7m0;

    iput p4, p0, La/u2w;->d:F

    iput p5, p0, La/u2w;->e:F

    iput-byte p7, p0, La/u2w;->f:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    iget-object v0, p0, La/u2w;->a:La/mm40;

    .line 15
    .line 16
    iget-object v1, p0, La/u2w;->b:La/l7m0;

    .line 17
    .line 18
    iget-object v2, p0, La/u2w;->c:La/l7m0;

    .line 19
    .line 20
    iget v3, p0, La/u2w;->d:F

    .line 21
    .line 22
    iget v4, p0, La/u2w;->e:F

    .line 23
    .line 24
    iget-byte v7, p0, La/u2w;->f:B

    .line 25
    .line 26
    invoke-static/range {v0 .. v7}, La/jeb;->C(La/mm40;La/l7m0;La/l7m0;FFLa/fet;II)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method
