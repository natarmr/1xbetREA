.class public final synthetic La/ggg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wgu;

.field public final synthetic c:La/pru;

.field public final synthetic d:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/wgu;La/pru;La/r9u;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ggg;->a:B

    iput-object p1, p0, La/ggg;->b:La/wgu;

    iput-object p2, p0, La/ggg;->c:La/pru;

    iput-object p3, p0, La/ggg;->d:La/r9u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ggg;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ggg;->d:La/r9u;

    .line 4
    .line 5
    iget-object v2, p0, La/ggg;->c:La/pru;

    .line 6
    .line 7
    iget-object p0, p0, La/ggg;->b:La/wgu;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v3, La/i7o0;

    .line 13
    .line 14
    invoke-virtual {p0}, La/wgu;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    sget-object v8, La/iun;->a:La/iun;

    .line 19
    .line 20
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    sget-object p0, La/ygp;->t:La/ygp;

    .line 25
    .line 26
    iget-object v0, v1, La/r9u;->a:La/j1q0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, La/m1q0;->d(La/ygp;)Z

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    const/4 v4, 0x1

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v9, 0x1

    .line 41
    invoke-direct/range {v3 .. v11}, La/i7o0;-><init>(ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/sff0;Z)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :pswitch_0
    new-instance v4, La/egg;

    .line 46
    .line 47
    invoke-virtual {p0}, La/wgu;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    sget-object v9, La/iun;->a:La/iun;

    .line 52
    .line 53
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    sget-object p0, La/ygp;->t:La/ygp;

    .line 58
    .line 59
    iget-object v0, v1, La/r9u;->a:La/j1q0;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, La/m1q0;->d(La/ygp;)Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    const/4 v5, 0x1

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v10, 0x1

    .line 74
    invoke-direct/range {v4 .. v12}, La/egg;-><init>(ZLjava/lang/Integer;Ljava/lang/String;La/vdg;Ljava/util/List;ZLa/sff0;Z)V

    .line 75
    .line 76
    .line 77
    return-object v4

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
