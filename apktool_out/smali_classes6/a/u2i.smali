.class public final synthetic La/u2i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;IZLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u2i;->a:La/mm40;

    iput p2, p0, La/u2i;->b:I

    iput-boolean p3, p0, La/u2i;->c:Z

    iput-object p4, p0, La/u2i;->d:Lkotlin/jvm/functions/Function0;

    iput p5, p0, La/u2i;->e:I

    iput-boolean p6, p0, La/u2i;->f:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/u2i;->e:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, La/u2i;->a:La/mm40;

    .line 18
    .line 19
    iget v1, p0, La/u2i;->b:I

    .line 20
    .line 21
    iget-boolean v2, p0, La/u2i;->c:Z

    .line 22
    .line 23
    iget-object v3, p0, La/u2i;->d:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    iget-boolean v6, p0, La/u2i;->f:Z

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, La/ebc;->n(La/mm40;IZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
