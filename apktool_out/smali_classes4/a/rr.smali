.class public final synthetic La/rr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JJLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/rr;->a:B

    iput-object p1, p0, La/rr;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/rr;->b:J

    iput-wide p4, p0, La/rr;->c:J

    iput-object p6, p0, La/rr;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/rr;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/rr;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/rr;->d:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, La/c810;

    .line 11
    .line 12
    check-cast v1, La/ru90;

    .line 13
    .line 14
    invoke-virtual {v2}, La/c810;->Q0()La/a810;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    iput-boolean v3, v0, La/a810;->a:Z

    .line 20
    .line 21
    invoke-virtual {v2}, La/c810;->Q0()La/a810;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-wide v3, p0, La/rr;->b:J

    .line 26
    .line 27
    iput-wide v3, v0, La/a810;->b:J

    .line 28
    .line 29
    invoke-virtual {v2}, La/c810;->Q0()La/a810;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-wide v3, p0, La/rr;->c:J

    .line 34
    .line 35
    iput-wide v3, v0, La/a810;->c:J

    .line 36
    .line 37
    iget-object p0, v1, La/ru90;->a:La/uj30;

    .line 38
    .line 39
    invoke-interface {p0}, La/uj30;->e()Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, La/c810;->Q0()La/a810;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast v2, La/xr;

    .line 56
    .line 57
    move-object v14, v1

    .line 58
    check-cast v14, La/xvs;

    .line 59
    .line 60
    iget-object v0, v2, La/xr;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, La/m0o0;

    .line 63
    .line 64
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v3, La/k8p;

    .line 68
    .line 69
    const-string v11, ""

    .line 70
    .line 71
    const-wide/16 v12, 0x0

    .line 72
    .line 73
    iget-wide v4, p0, La/rr;->b:J

    .line 74
    .line 75
    iget-wide v6, p0, La/rr;->c:J

    .line 76
    .line 77
    const-wide/16 v8, 0x0

    .line 78
    .line 79
    const-string v10, ""

    .line 80
    .line 81
    invoke-direct/range {v3 .. v14}, La/k8p;-><init>(JJJLjava/lang/String;Ljava/lang/String;JLa/xvs;)V

    .line 82
    .line 83
    .line 84
    iget-object p0, v0, La/m0o0;->b:La/abp;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/abp;->b:La/p7m0;

    .line 90
    .line 91
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object v1, v0

    .line 96
    check-cast v1, La/kap;

    .line 97
    .line 98
    new-instance v2, La/iap;

    .line 99
    .line 100
    invoke-static {v1}, La/abp;->e(La/kap;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v2, v1}, La/iap;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_1

    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
