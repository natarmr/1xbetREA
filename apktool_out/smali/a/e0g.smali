.class public final synthetic La/e0g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(IILa/mm40;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput-byte p2, p0, La/e0g;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/e0g;->b:Ljava/lang/Object;

    iput-byte p1, p0, La/e0g;->c:B

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/e0g;->a:B

    iput-object p1, p0, La/e0g;->b:Ljava/lang/Object;

    iput-byte p2, p0, La/e0g;->c:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e0g;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/e0g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-byte p0, p0, La/e0g;->c:B

    .line 18
    .line 19
    or-int/lit8 p0, p0, 0x1

    .line 20
    .line 21
    invoke-static {p0}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {v0, p1, p0}, La/obb;->B(Ljava/lang/String;La/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-object v0, p0, La/e0g;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, La/mm40;

    .line 34
    .line 35
    check-cast p1, La/fet;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-byte p0, p0, La/e0g;->c:B

    .line 43
    .line 44
    or-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    invoke-static {p0}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0, p1, v0}, La/jtt0;->d(ILa/fet;La/mm40;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    iget-object v0, p0, La/e0g;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, La/mm40;

    .line 59
    .line 60
    check-cast p1, La/fet;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-byte p0, p0, La/e0g;->c:B

    .line 68
    .line 69
    or-int/lit8 p0, p0, 0x1

    .line 70
    .line 71
    invoke-static {p0}, La/x8x;->L(I)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-static {p0, p1, v0}, La/m2x;->h(ILa/fet;La/mm40;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_2
    iget-object v0, p0, La/e0g;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/mm40;

    .line 84
    .line 85
    check-cast p1, La/fet;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/16 p2, 0x31

    .line 93
    .line 94
    invoke-static {p2}, La/x8x;->L(I)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    iget-byte p0, p0, La/e0g;->c:B

    .line 99
    .line 100
    invoke-static {p0, p2, p1, v0}, La/xvw;->d(IILa/fet;La/mm40;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_3
    iget-object v0, p0, La/e0g;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/mm40;

    .line 109
    .line 110
    check-cast p1, La/fet;

    .line 111
    .line 112
    check-cast p2, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-byte p0, p0, La/e0g;->c:B

    .line 118
    .line 119
    or-int/lit8 p0, p0, 0x1

    .line 120
    .line 121
    invoke-static {p0}, La/x8x;->L(I)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-static {p0, p1, v0}, La/ozb;->F(ILa/fet;La/mm40;)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
