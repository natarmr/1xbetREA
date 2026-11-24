.class public final synthetic La/pzo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/bdz;

.field public final synthetic d:La/e2d;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/bdz;La/e2d;La/l7m0;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/pzo0;->a:B

    iput-object p1, p0, La/pzo0;->b:La/mm40;

    iput-object p2, p0, La/pzo0;->c:La/bdz;

    iput-object p3, p0, La/pzo0;->d:La/e2d;

    iput-object p4, p0, La/pzo0;->e:La/l7m0;

    iput-object p5, p0, La/pzo0;->f:Lkotlin/jvm/functions/Function1;

    iput p6, p0, La/pzo0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/pzo0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/pzo0;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v7, p1

    .line 9
    check-cast v7, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v2, p0, La/pzo0;->b:La/mm40;

    .line 23
    .line 24
    iget-object v3, p0, La/pzo0;->c:La/bdz;

    .line 25
    .line 26
    iget-object v4, p0, La/pzo0;->d:La/e2d;

    .line 27
    .line 28
    iget-object v5, p0, La/pzo0;->e:La/l7m0;

    .line 29
    .line 30
    iget-object v6, p0, La/pzo0;->f:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    invoke-static/range {v2 .. v8}, La/dwi0;->C(La/mm40;La/bdz;La/e2d;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    move-object v5, p1

    .line 39
    check-cast v5, La/fet;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    or-int/lit8 p1, v1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-object v0, p0, La/pzo0;->b:La/mm40;

    .line 53
    .line 54
    iget-object v1, p0, La/pzo0;->c:La/bdz;

    .line 55
    .line 56
    iget-object v2, p0, La/pzo0;->d:La/e2d;

    .line 57
    .line 58
    iget-object v3, p0, La/pzo0;->e:La/l7m0;

    .line 59
    .line 60
    iget-object v4, p0, La/pzo0;->f:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    invoke-static/range {v0 .. v6}, La/cy2;->s(La/mm40;La/bdz;La/e2d;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
