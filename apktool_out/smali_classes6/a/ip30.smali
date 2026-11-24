.class public final synthetic La/ip30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/cgk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ip30;->a:B

    iput-object p1, p0, La/ip30;->b:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ip30;->a:B

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/ip30;->b:La/cgk0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ge v0, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/j6z;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, La/j6z;->g()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    and-long v0, v3, v1

    .line 41
    .line 42
    long-to-int p1, v0

    .line 43
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast p1, La/j6z;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, La/j6z;->g()J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    and-long v0, v3, v1

    .line 59
    .line 60
    long-to-int p1, v0

    .line 61
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    check-cast p1, La/j6z;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, La/j6z;->g()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    and-long v0, v3, v1

    .line 77
    .line 78
    long-to-int p1, v0

    .line 79
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_3
    check-cast p1, La/j6z;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, La/j6z;->g()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    and-long v0, v3, v1

    .line 95
    .line 96
    long-to-int p1, v0

    .line 97
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
