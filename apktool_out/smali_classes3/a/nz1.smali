.class public final synthetic La/nz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wz1;

.field public final synthetic c:La/myr0;


# direct methods
.method public synthetic constructor <init>(La/wz1;La/myr0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nz1;->a:B

    iput-object p1, p0, La/nz1;->b:La/wz1;

    iput-object p2, p0, La/nz1;->c:La/myr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/nz1;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/nz1;->c:La/myr0;

    .line 4
    .line 5
    iget-object p0, p0, La/nz1;->b:La/wz1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wz1;->T:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, La/wz1;->Q(La/myr0;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    sget-object v0, La/wz1;->T:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, La/wz1;->Q(La/myr0;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    sget-object v0, La/wz1;->T:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 29
    .line 30
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v2, v0

    .line 40
    check-cast v2, La/dz1;

    .line 41
    .line 42
    iget-wide v3, v1, La/myr0;->a:J

    .line 43
    .line 44
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    const/4 v11, 0x0

    .line 49
    const/16 v12, 0x9ff

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v10, 0x1

    .line 58
    invoke-static/range {v2 .. v12}, La/dz1;->a(La/dz1;ZZZLa/ql5;ZLa/myr0;Ljava/lang/Long;ZLa/bie;I)La/dz1;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p0, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
