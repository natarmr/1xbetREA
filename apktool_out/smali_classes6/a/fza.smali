.class public final La/fza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gza;


# direct methods
.method public synthetic constructor <init>(La/gza;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fza;->a:B

    iput-object p1, p0, La/fza;->b:La/gza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fza;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/fza;->b:La/gza;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, La/gza;->c:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 13
    .line 14
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 26
    .line 27
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    :goto_0
    new-instance p0, La/y3d;

    .line 38
    .line 39
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    iget-boolean p0, p0, La/gza;->c:Z

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 48
    .line 49
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 54
    .line 55
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundLight60-0d7_KjU()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 61
    .line 62
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 67
    .line 68
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    :goto_1
    new-instance p0, La/y3d;

    .line 73
    .line 74
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 75
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
