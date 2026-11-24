.class public final synthetic La/zjm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/y3d;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/mm40;ZFFLa/y3d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zjm;->a:La/mm40;

    iput-boolean p2, p0, La/zjm;->b:Z

    iput p3, p0, La/zjm;->c:F

    iput p4, p0, La/zjm;->d:F

    iput-object p5, p0, La/zjm;->e:La/y3d;

    iput p6, p0, La/zjm;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    iget p1, p0, La/zjm;->f:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, La/zjm;->a:La/mm40;

    .line 18
    .line 19
    iget-boolean v1, p0, La/zjm;->b:Z

    .line 20
    .line 21
    iget v2, p0, La/zjm;->c:F

    .line 22
    .line 23
    iget v3, p0, La/zjm;->d:F

    .line 24
    .line 25
    iget-object v4, p0, La/zjm;->e:La/y3d;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, La/f7k;->x(La/mm40;ZFFLa/y3d;La/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
