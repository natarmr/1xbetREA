.class public final La/ker;
.super La/o7v;
.source "SourceFile"


# instance fields
.field public final synthetic e:B


# direct methods
.method public synthetic constructor <init>(La/eu00;La/h1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ker;->e:B

    invoke-direct {p0, p1, p2}, La/o7v;-><init>(La/eu00;La/h1;)V

    return-void
.end method


# virtual methods
.method public final h()Ljava/util/List;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ker;->e:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, La/iun;->a:La/iun;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, La/o7v;->b:La/h1;

    .line 10
    .line 11
    check-cast p0, La/ier;

    .line 12
    .line 13
    iget-object v0, p0, La/ier;->g:La/wer;

    .line 14
    .line 15
    sget-object v1, La/ser;->d:La/ser;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p0, v0}, La/jeb;->N(La/ier;Z)La/per;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v1, La/ver;->d:La/ver;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {p0, v0}, La/jeb;->N(La/ier;Z)La/per;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object p0, La/iun;->a:La/iun;

    .line 52
    .line 53
    :goto_0
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
