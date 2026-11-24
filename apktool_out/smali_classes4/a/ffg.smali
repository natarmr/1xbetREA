.class public final synthetic La/ffg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gfg;


# direct methods
.method public synthetic constructor <init>(La/gfg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ffg;->a:B

    iput-object p1, p0, La/ffg;->b:La/gfg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ffg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ffg;->b:La/gfg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v1, p1

    .line 9
    check-cast v1, La/fcg;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, La/gfg;->h:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, p1

    .line 16
    check-cast v2, La/y78;

    .line 17
    .line 18
    iget-object p1, p0, La/gfg;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, La/dfg;

    .line 21
    .line 22
    iget-object v3, p0, La/gfg;->c:La/ctf0;

    .line 23
    .line 24
    iget-boolean v4, p1, La/dfg;->e:Z

    .line 25
    .line 26
    iget-object v5, p1, La/dfg;->b:La/sff0;

    .line 27
    .line 28
    iget-object p0, p0, La/gfg;->d:La/n0o0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/fee;

    .line 35
    .line 36
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    iget-object v8, p1, La/dfg;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-boolean v9, p1, La/dfg;->h:Z

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-static/range {v1 .. v9}, La/agc;->F(La/fcg;La/y78;La/ctf0;ZLa/sff0;ZZLjava/util/List;Z)La/lc00;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-nez p0, :cond_1

    .line 56
    .line 57
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 58
    .line 59
    :cond_1
    return-object p0

    .line 60
    :pswitch_0
    move-object v0, p1

    .line 61
    check-cast v0, La/fcg;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object p1, p0, La/gfg;->h:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v1, p1

    .line 68
    check-cast v1, La/y78;

    .line 69
    .line 70
    iget-object p1, p0, La/gfg;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, La/dfg;

    .line 73
    .line 74
    iget-object v2, p0, La/gfg;->c:La/ctf0;

    .line 75
    .line 76
    iget-boolean v3, p1, La/dfg;->e:Z

    .line 77
    .line 78
    iget-object v4, p1, La/dfg;->b:La/sff0;

    .line 79
    .line 80
    iget-object p0, p0, La/gfg;->d:La/n0o0;

    .line 81
    .line 82
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/fee;

    .line 87
    .line 88
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    iget-object v7, p1, La/dfg;->d:Ljava/util/List;

    .line 99
    .line 100
    iget-boolean v8, p1, La/dfg;->h:Z

    .line 101
    .line 102
    const/4 v5, 0x1

    .line 103
    invoke-static/range {v0 .. v8}, La/agc;->F(La/fcg;La/y78;La/ctf0;ZLa/sff0;ZZLjava/util/List;Z)La/lc00;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-nez p0, :cond_3

    .line 108
    .line 109
    :cond_2
    sget-object p0, La/iun;->a:La/iun;

    .line 110
    .line 111
    :cond_3
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
