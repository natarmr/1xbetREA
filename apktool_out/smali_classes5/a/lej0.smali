.class public final synthetic La/lej0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/settings/impl/presentation/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/settings/impl/presentation/a;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lej0;->a:B

    iput-object p1, p0, La/lej0;->b:Lorg/xplatform/settings/impl/presentation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lej0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/lej0;->b:Lorg/xplatform/settings/impl/presentation/a;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->d:La/s31;

    .line 11
    .line 12
    invoke-virtual {v1}, La/s31;->w()V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->A:La/s64;

    .line 16
    .line 17
    const-string v2, "oneclick"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, La/s64;->e(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/w0j0;->a:La/w0j0;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->y(Z)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v2, v1

    .line 45
    check-cast v2, La/caj0;

    .line 46
    .line 47
    const/16 v24, 0x0

    .line 48
    .line 49
    const v25, 0x1fffffb

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    invoke-static/range {v2 .. v25}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
