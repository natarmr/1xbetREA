.class public final synthetic La/hbn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BLa/a4x;Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/hbn0;->a:B

    iput-object p2, p0, La/hbn0;->b:La/a4x;

    iput-boolean p4, p0, La/hbn0;->c:Z

    iput-boolean p5, p0, La/hbn0;->d:Z

    iput-object p3, p0, La/hbn0;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hbn0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    check-cast p1, La/ir8;

    .line 8
    .line 9
    move-object v9, p2

    .line 10
    check-cast v9, La/fet;

    .line 11
    .line 12
    check-cast p3, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 p1, p2, 0x11

    .line 25
    .line 26
    if-eq p1, v2, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    :cond_0
    and-int/lit8 p1, p2, 0x1

    .line 30
    .line 31
    invoke-virtual {v9, p1, v1}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    iget-object v5, p0, La/hbn0;->b:La/a4x;

    .line 40
    .line 41
    iget-boolean v6, p0, La/hbn0;->c:Z

    .line 42
    .line 43
    iget-boolean v7, p0, La/hbn0;->d:Z

    .line 44
    .line 45
    iget-object v8, p0, La/hbn0;->e:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-static/range {v4 .. v10}, La/bsr0;->L(La/mm40;La/a4x;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v9}, La/fet;->X()V

    .line 52
    .line 53
    .line 54
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    and-int/lit8 p1, p2, 0x11

    .line 61
    .line 62
    if-eq p1, v2, :cond_2

    .line 63
    .line 64
    move v1, v3

    .line 65
    :cond_2
    and-int/lit8 p1, p2, 0x1

    .line 66
    .line 67
    invoke-virtual {v9, p1, v1}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    iget-object v5, p0, La/hbn0;->b:La/a4x;

    .line 76
    .line 77
    iget-boolean v6, p0, La/hbn0;->c:Z

    .line 78
    .line 79
    iget-boolean v7, p0, La/hbn0;->d:Z

    .line 80
    .line 81
    iget-object v8, p0, La/hbn0;->e:Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    invoke-static/range {v4 .. v10}, La/ccq0;->L(La/mm40;La/a4x;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
