.class public final synthetic La/r8y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s8y;


# direct methods
.method public synthetic constructor <init>(La/s8y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r8y;->a:B

    iput-object p1, p0, La/r8y;->b:La/s8y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/r8y;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/r8y;->b:La/s8y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v2, p1

    .line 9
    check-cast v2, Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, La/s8y;->a:Ljava/lang/String;

    .line 15
    .line 16
    sget-object p0, La/yoj0;->a:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, La/xoj0;

    .line 22
    .line 23
    new-instance v5, La/bai0;

    .line 24
    .line 25
    const/16 p1, 0x12

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {v5, p0, v0, p1}, La/bai0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    new-instance v6, La/jgb0;

    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    const/16 p1, 0xf

    .line 35
    .line 36
    invoke-direct {v6, p0, v0, p1}, La/jgb0;-><init>(ILa/yje;B)V

    .line 37
    .line 38
    .line 39
    sget-object v4, La/zoj0;->a:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    invoke-direct/range {v1 .. v6}, La/xoj0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;La/bai0;La/jgb0;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_0
    check-cast p1, La/soe;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-class v0, La/s8y;

    .line 55
    .line 56
    sget-object v1, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, "CorruptionException in "

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, La/s8y;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p0, " DataStore running in process "

    .line 79
    .line 80
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {v0, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    new-instance p0, La/az40;

    .line 98
    .line 99
    const/4 p1, 0x1

    .line 100
    invoke-direct {p0, p1}, La/az40;-><init>(Z)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
