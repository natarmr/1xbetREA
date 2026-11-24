.class public final La/v910;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fa10;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:La/mm40;

.field public final synthetic e:La/qge;

.field public final synthetic f:I

.field public final synthetic g:B

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/fa10;Lkotlin/jvm/functions/Function0;La/mm40;La/qge;IIIB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/v910;->a:B

    iput-object p1, p0, La/v910;->b:La/fa10;

    iput-object p2, p0, La/v910;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/v910;->d:La/mm40;

    iput-object p4, p0, La/v910;->e:La/qge;

    iput p5, p0, La/v910;->f:I

    iput-byte p6, p0, La/v910;->g:B

    iput p7, p0, La/v910;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/v910;->a:B

    .line 2
    .line 3
    iget-byte v1, p0, La/v910;->g:B

    .line 4
    .line 5
    iget v2, p0, La/v910;->f:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v7, p1

    .line 11
    check-cast v7, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    or-int/lit8 p1, v2, 0x1

    .line 19
    .line 20
    invoke-static {p1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    invoke-static {v1}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    iget v10, p0, La/v910;->h:I

    .line 29
    .line 30
    iget-object v3, p0, La/v910;->b:La/fa10;

    .line 31
    .line 32
    iget-object v4, p0, La/v910;->c:Lkotlin/jvm/functions/Function0;

    .line 33
    .line 34
    iget-object v5, p0, La/v910;->d:La/mm40;

    .line 35
    .line 36
    iget-object v6, p0, La/v910;->e:La/qge;

    .line 37
    .line 38
    invoke-static/range {v3 .. v10}, La/piz;->j(La/fa10;Lkotlin/jvm/functions/Function0;La/mm40;La/qge;La/fet;III)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object v4, p1

    .line 45
    check-cast v4, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    or-int/lit8 p1, v2, 0x1

    .line 53
    .line 54
    invoke-static {p1}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static {v1}, La/x8x;->L(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    iget v7, p0, La/v910;->h:I

    .line 63
    .line 64
    iget-object v0, p0, La/v910;->b:La/fa10;

    .line 65
    .line 66
    iget-object v1, p0, La/v910;->c:Lkotlin/jvm/functions/Function0;

    .line 67
    .line 68
    iget-object v2, p0, La/v910;->d:La/mm40;

    .line 69
    .line 70
    iget-object v3, p0, La/v910;->e:La/qge;

    .line 71
    .line 72
    invoke-static/range {v0 .. v7}, La/piz;->j(La/fa10;Lkotlin/jvm/functions/Function0;La/mm40;La/qge;La/fet;III)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
