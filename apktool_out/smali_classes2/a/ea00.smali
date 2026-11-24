.class public final synthetic La/ea00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:La/a4x;

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;ILa/a4x;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/ea00;->a:B

    iput-object p1, p0, La/ea00;->b:La/mm40;

    iput p2, p0, La/ea00;->c:I

    iput-object p3, p0, La/ea00;->d:La/a4x;

    iput p4, p0, La/ea00;->e:F

    iput p5, p0, La/ea00;->f:F

    iput-object p6, p0, La/ea00;->g:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/ea00;->h:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ea00;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0xc07

    .line 15
    .line 16
    invoke-static {p1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result v9

    .line 20
    iget-object v1, p0, La/ea00;->b:La/mm40;

    .line 21
    .line 22
    iget v2, p0, La/ea00;->c:I

    .line 23
    .line 24
    iget-object v3, p0, La/ea00;->d:La/a4x;

    .line 25
    .line 26
    iget v4, p0, La/ea00;->e:F

    .line 27
    .line 28
    iget v5, p0, La/ea00;->f:F

    .line 29
    .line 30
    iget-object v6, p0, La/ea00;->g:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    iget-object v7, p0, La/ea00;->h:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    invoke-static/range {v1 .. v9}, La/jiq0;->I(La/mm40;ILa/a4x;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    move-object v7, p1

    .line 41
    check-cast v7, La/fet;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/16 p1, 0xc07

    .line 49
    .line 50
    invoke-static {p1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    iget-object v0, p0, La/ea00;->b:La/mm40;

    .line 55
    .line 56
    iget v1, p0, La/ea00;->c:I

    .line 57
    .line 58
    iget-object v2, p0, La/ea00;->d:La/a4x;

    .line 59
    .line 60
    iget v3, p0, La/ea00;->e:F

    .line 61
    .line 62
    iget v4, p0, La/ea00;->f:F

    .line 63
    .line 64
    iget-object v5, p0, La/ea00;->g:Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    iget-object v6, p0, La/ea00;->h:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-static/range {v0 .. v8}, La/jiq0;->I(La/mm40;ILa/a4x;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
