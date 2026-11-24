.class public final synthetic La/sc80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/Map;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(ZZZJLjava/util/Map;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/sc80;->a:Z

    iput-boolean p2, p0, La/sc80;->b:Z

    iput-boolean p3, p0, La/sc80;->c:Z

    iput-wide p4, p0, La/sc80;->d:J

    iput-object p6, p0, La/sc80;->e:Ljava/util/Map;

    iput p7, p0, La/sc80;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/iz30;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/16 v1, 0x18

    .line 15
    .line 16
    iget-boolean v2, p0, La/sc80;->b:Z

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/16 v1, 0x27

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    new-instance p0, La/sx10;

    .line 28
    .line 29
    invoke-direct {p0, p1, v2}, La/sx10;-><init>(La/iz30;Z)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    new-instance v0, La/lx10;

    .line 34
    .line 35
    iget-object p0, p0, La/sc80;->e:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/lang/String;

    .line 42
    .line 43
    if-nez p0, :cond_0

    .line 44
    .line 45
    const-string p0, ""

    .line 46
    .line 47
    :cond_0
    invoke-direct {v0, p1, p0, v2}, La/lx10;-><init>(La/iz30;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    new-instance p0, La/qx10;

    .line 52
    .line 53
    invoke-direct {p0, p1}, La/qx10;-><init>(La/iz30;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_2
    iget-boolean p0, p0, La/sc80;->c:Z

    .line 58
    .line 59
    if-eqz p0, :cond_1

    .line 60
    .line 61
    new-instance p0, La/rx10;

    .line 62
    .line 63
    invoke-direct {p0, p1}, La/rx10;-><init>(La/iz30;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_1
    const/4 p0, 0x0

    .line 68
    return-object p0

    .line 69
    :cond_2
    new-instance v0, La/ix10;

    .line 70
    .line 71
    iget-wide v1, p0, La/sc80;->d:J

    .line 72
    .line 73
    invoke-direct {v0, p1, v1, v2}, La/ix10;-><init>(La/iz30;J)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_3
    new-instance v0, La/hx10;

    .line 78
    .line 79
    iget-boolean p0, p0, La/sc80;->a:Z

    .line 80
    .line 81
    invoke-direct {v0, p1, p0, v2}, La/hx10;-><init>(La/iz30;ZZ)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_4
    new-instance v0, La/xx10;

    .line 86
    .line 87
    iget p0, p0, La/sc80;->f:I

    .line 88
    .line 89
    invoke-direct {v0, p1, p0}, La/xx10;-><init>(La/iz30;I)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
