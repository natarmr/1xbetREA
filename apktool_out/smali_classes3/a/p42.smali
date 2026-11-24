.class public final synthetic La/p42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t42;


# direct methods
.method public synthetic constructor <init>(La/t42;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p42;->a:B

    iput-object p1, p0, La/p42;->b:La/t42;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p42;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    iget-object p0, p0, La/p42;->b:La/t42;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    check-cast p2, Landroid/os/Bundle;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/t42;->p2:La/jdk0;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    if-gt p1, v1, :cond_0

    .line 25
    .line 26
    const-string p1, "RESULT_KEY_CALENDAR_DATE_RANGE"

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p2}, La/uq6;->B(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Landroid/os/Parcelable;

    .line 38
    .line 39
    :goto_0
    check-cast p1, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, La/t42;->Q0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p2, La/i42;

    .line 48
    .line 49
    invoke-direct {p2, p1}, La/i42;-><init>(Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    sget-object v0, La/t42;->p2:La/jdk0;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    if-gt p1, v1, :cond_2

    .line 69
    .line 70
    const-string p1, "RESULT_KEY_CALENDAR_SIMPLE_DATE"

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {p2}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Landroid/os/Parcelable;

    .line 82
    .line 83
    :goto_1
    check-cast p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, La/t42;->Q0()La/k3t0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance p2, La/j42;

    .line 92
    .line 93
    invoke-direct {p2, p1}, La/j42;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
