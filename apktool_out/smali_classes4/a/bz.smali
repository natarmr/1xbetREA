.class public final synthetic La/bz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/r9u;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bz;->a:B

    iput-object p1, p0, La/bz;->b:La/r9u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/bz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bz;->b:La/r9u;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v2, La/pnf0;->a:La/pnf0;

    .line 9
    .line 10
    sget-object v0, La/ygp;->t:La/ygp;

    .line 11
    .line 12
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    new-instance v1, La/c6b0;

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    sget-object v3, La/jdt;->a:La/jdt;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    invoke-direct/range {v1 .. v11}, La/c6b0;-><init>(La/pnf0;La/pdt;La/v5l0;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;La/wcb;Ljava/util/List;Z)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_0
    new-instance v2, La/yc40;

    .line 39
    .line 40
    sget-object v3, La/xb40;->a:La/xb40;

    .line 41
    .line 42
    sget-object v4, La/iun;->a:La/iun;

    .line 43
    .line 44
    sget-object v0, La/ygp;->t:La/ygp;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, La/j1q0;->a(La/ygp;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x1

    .line 58
    invoke-direct/range {v2 .. v8}, La/yc40;-><init>(La/xb40;Ljava/util/List;La/j0g0;ZZZ)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :pswitch_1
    new-instance v0, La/my;

    .line 63
    .line 64
    sget-object v1, La/iun;->a:La/iun;

    .line 65
    .line 66
    sget-object v2, La/ygp;->t:La/ygp;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 77
    .line 78
    invoke-virtual {p0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    const/4 v2, 0x1

    .line 83
    const/4 v3, 0x0

    .line 84
    if-eqz p0, :cond_0

    .line 85
    .line 86
    invoke-static {}, La/cy7;->c()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_0

    .line 91
    .line 92
    move p0, v2

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    move p0, v3

    .line 95
    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, La/my;-><init>(Ljava/util/List;ZZZ)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
