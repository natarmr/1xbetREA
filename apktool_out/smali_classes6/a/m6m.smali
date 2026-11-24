.class public final La/m6m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n4d;


# static fields
.field public static final b:La/m6m;

.field public static final c:La/m6m;

.field public static final d:La/m6m;

.field public static final e:La/m6m;

.field public static final f:La/m6m;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/m6m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/m6m;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/m6m;->b:La/m6m;

    .line 8
    .line 9
    new-instance v0, La/m6m;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, La/m6m;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/m6m;->c:La/m6m;

    .line 16
    .line 17
    new-instance v0, La/m6m;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, La/m6m;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/m6m;->d:La/m6m;

    .line 24
    .line 25
    new-instance v0, La/m6m;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, La/m6m;-><init>(B)V

    .line 29
    .line 30
    .line 31
    sput-object v0, La/m6m;->e:La/m6m;

    .line 32
    .line 33
    new-instance v0, La/m6m;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, La/m6m;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/m6m;->f:La/m6m;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/m6m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-byte p0, p0, La/m6m;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 14
    .line 15
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 20
    .line 21
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    return-wide v0

    .line 26
    :pswitch_1
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 27
    .line 28
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 33
    .line 34
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0

    .line 39
    :pswitch_2
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 40
    .line 41
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 46
    .line 47
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0

    .line 52
    :pswitch_3
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 53
    .line 54
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 55
    .line 56
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    return-wide v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
