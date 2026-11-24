.class public final La/bt40;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bt40;->a:B

    iput-object p1, p0, La/bt40;->b:Ljava/lang/Object;

    iput p2, p0, La/bt40;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bt40;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, La/bt40;->c:I

    .line 5
    .line 6
    iget-object p0, p0, La/bt40;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    check-cast p0, Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, La/sgi0;

    .line 26
    .line 27
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 28
    .line 29
    add-int/2addr p1, v2

    .line 30
    add-int/2addr v2, p2

    .line 31
    invoke-direct {v3, p1, v2, v1}, Lkotlin/ranges/a;-><init>(III)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/cy2;->z:La/ar20;

    .line 35
    .line 36
    invoke-direct {v0, v3, p1}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p1, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    check-cast p0, La/agk0;

    .line 53
    .line 54
    or-int/lit8 p2, v2, 0x1

    .line 55
    .line 56
    invoke-static {p2}, La/x8x;->L(I)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-static {p0, p1, p2}, La/n6x;->h(La/agk0;La/fet;I)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    check-cast p1, La/fet;

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 71
    .line 72
    .line 73
    check-cast p0, La/agk0;

    .line 74
    .line 75
    or-int/lit8 p2, v2, 0x1

    .line 76
    .line 77
    invoke-static {p2}, La/x8x;->L(I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-static {p0, p1, p2}, La/n6x;->h(La/agk0;La/fet;I)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
