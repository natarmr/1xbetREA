.class public final synthetic La/yd10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j1q0;


# direct methods
.method public synthetic constructor <init>(La/j1q0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yd10;->a:B

    iput-object p1, p0, La/yd10;->b:La/j1q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/yd10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/yd10;->b:La/j1q0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v2, La/p560;

    .line 10
    .line 11
    sget-object v4, La/lun;->a:La/lun;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/m1q0;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    const-string v3, ""

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-direct/range {v2 .. v7}, La/p560;-><init>(Ljava/lang/String;Ljava/util/Map;ZZZ)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 31
    .line 32
    iget-object p0, p0, La/m1q0;->a:La/q7d0;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "INTERNET_EMULATION_ENABLED"

    .line 42
    .line 43
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_1
    new-instance v0, La/td10;

    .line 53
    .line 54
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/m1q0;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 v2, 0x1

    .line 61
    const-string v3, ""

    .line 62
    .line 63
    invoke-direct {v0, v3, p0, v2, v1}, La/td10;-><init>(Ljava/lang/String;ZZZ)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
