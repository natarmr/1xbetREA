.class public final synthetic La/c830;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l830;


# direct methods
.method public synthetic constructor <init>(La/l830;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c830;->a:B

    iput-object p1, p0, La/c830;->b:La/l830;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/c830;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/c830;->b:La/l830;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/y130;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, La/g730;

    .line 14
    .line 15
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/m730;

    .line 20
    .line 21
    iget-object p0, p0, La/m730;->c:La/l9s;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, La/l9s;->b()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-wide/16 v1, -0x1

    .line 31
    .line 32
    :goto_0
    invoke-direct {v0, p1, v1, v2}, La/g730;-><init>(La/y130;J)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 42
    .line 43
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, La/m730;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/16 v10, 0xbf

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v5, 0x0

    .line 66
    const-wide/16 v6, 0x0

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    invoke-static/range {v2 .. v10}, La/m730;->a(La/m730;Ljava/util/List;Ljava/util/LinkedHashMap;La/l9s;JLa/aw20;La/ycs;I)La/m730;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
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
