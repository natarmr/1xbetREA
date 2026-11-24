.class public final synthetic La/zij;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ymx;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:La/egk0;


# direct methods
.method public synthetic constructor <init>(La/ymx;Lkotlin/jvm/functions/Function0;La/egk0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zij;->a:B

    iput-object p1, p0, La/zij;->b:La/ymx;

    iput-object p2, p0, La/zij;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/zij;->d:La/egk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/zij;->a:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iget-object v3, p0, La/zij;->d:La/egk0;

    .line 6
    .line 7
    iget-object v4, p0, La/zij;->c:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    iget-object p0, p0, La/zij;->b:La/ymx;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v5

    .line 18
    invoke-virtual {v3}, La/egk0;->l()J

    .line 19
    .line 20
    .line 21
    move-result-wide v7

    .line 22
    cmp-long v0, v7, v1

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, La/egk0;->l()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    sub-long v0, v5, v0

    .line 31
    .line 32
    iget-short p0, p0, La/ymx;->a:S

    .line 33
    .line 34
    int-to-long v7, p0

    .line 35
    cmp-long p0, v0, v7

    .line 36
    .line 37
    if-lez p0, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v3, v5, v6}, La/egk0;->m(J)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    invoke-virtual {v3}, La/egk0;->l()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    cmp-long v0, v7, v1

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v3}, La/egk0;->l()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    sub-long v0, v5, v0

    .line 65
    .line 66
    iget-short p0, p0, La/ymx;->a:S

    .line 67
    .line 68
    int-to-long v7, p0

    .line 69
    cmp-long p0, v0, v7

    .line 70
    .line 71
    if-lez p0, :cond_3

    .line 72
    .line 73
    :cond_2
    invoke-virtual {v3, v5, v6}, La/egk0;->m(J)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
