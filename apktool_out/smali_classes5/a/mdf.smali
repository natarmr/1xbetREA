.class public final synthetic La/mdf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:I

.field public final synthetic d:La/pu90;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:La/pu90;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/pu90;ILa/pu90;IILa/pu90;IIB)V
    .locals 0

    .line 2
    iput-byte p9, p0, La/mdf;->a:B

    iput-object p1, p0, La/mdf;->b:La/pu90;

    iput p2, p0, La/mdf;->c:I

    iput-object p3, p0, La/mdf;->d:La/pu90;

    iput p4, p0, La/mdf;->e:I

    iput p5, p0, La/mdf;->f:I

    iput-object p6, p0, La/mdf;->g:La/pu90;

    iput p7, p0, La/mdf;->h:I

    iput p8, p0, La/mdf;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;IILa/pu90;III)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/mdf;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mdf;->b:La/pu90;

    iput-object p2, p0, La/mdf;->d:La/pu90;

    iput p3, p0, La/mdf;->c:I

    iput p4, p0, La/mdf;->e:I

    iput-object p5, p0, La/mdf;->g:La/pu90;

    iput p6, p0, La/mdf;->f:I

    iput p7, p0, La/mdf;->h:I

    iput p8, p0, La/mdf;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/mdf;->a:B

    .line 2
    .line 3
    iget v1, p0, La/mdf;->i:I

    .line 4
    .line 5
    iget v2, p0, La/mdf;->h:I

    .line 6
    .line 7
    iget v3, p0, La/mdf;->f:I

    .line 8
    .line 9
    iget-object v4, p0, La/mdf;->g:La/pu90;

    .line 10
    .line 11
    iget v5, p0, La/mdf;->e:I

    .line 12
    .line 13
    iget v6, p0, La/mdf;->c:I

    .line 14
    .line 15
    iget-object v7, p0, La/mdf;->d:La/pu90;

    .line 16
    .line 17
    iget-object p0, p0, La/mdf;->b:La/pu90;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    check-cast p1, La/ou90;

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, p0, v9, v9, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 32
    .line 33
    .line 34
    :cond_0
    if-eqz v7, :cond_1

    .line 35
    .line 36
    div-int/lit8 p0, v6, 0x2

    .line 37
    .line 38
    iget v0, v7, La/pu90;->a:I

    .line 39
    .line 40
    div-int/lit8 v0, v0, 0x2

    .line 41
    .line 42
    sub-int/2addr p0, v0

    .line 43
    invoke-virtual {p1, v7, p0, v5, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 44
    .line 45
    .line 46
    :cond_1
    if-eqz v4, :cond_2

    .line 47
    .line 48
    div-int/lit8 v6, v6, 0x2

    .line 49
    .line 50
    div-int/lit8 v3, v3, 0x2

    .line 51
    .line 52
    sub-int/2addr v6, v3

    .line 53
    div-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    add-int/2addr v2, v5

    .line 56
    div-int/lit8 v1, v1, 0x2

    .line 57
    .line 58
    sub-int/2addr v2, v1

    .line 59
    invoke-virtual {p1, v4, v6, v2, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 60
    .line 61
    .line 62
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0, v9, v6, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    add-int/2addr p0, v5

    .line 76
    invoke-virtual {p1, v7, p0, v3, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, La/pu90;->e0()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    sub-int/2addr v2, p0

    .line 84
    invoke-virtual {p1, v4, v2, v1, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p0, v9, v6, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v5

    .line 101
    invoke-virtual {p1, v7, p0, v3, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, La/pu90;->e0()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    sub-int/2addr v2, p0

    .line 109
    invoke-virtual {p1, v4, v2, v1, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
