.class public final synthetic La/wv20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:I

.field public final synthetic d:La/pu90;

.field public final synthetic e:La/pu90;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/pu90;ILa/pu90;ILa/pu90;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/wv20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wv20;->b:La/pu90;

    iput p2, p0, La/wv20;->c:I

    iput-object p3, p0, La/wv20;->d:La/pu90;

    iput p4, p0, La/wv20;->f:I

    iput-object p5, p0, La/wv20;->e:La/pu90;

    iput p6, p0, La/wv20;->g:I

    iput p7, p0, La/wv20;->h:I

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;ILa/pu90;La/pu90;III)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/wv20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wv20;->b:La/pu90;

    iput p2, p0, La/wv20;->c:I

    iput-object p3, p0, La/wv20;->d:La/pu90;

    iput-object p4, p0, La/wv20;->e:La/pu90;

    iput p5, p0, La/wv20;->f:I

    iput p6, p0, La/wv20;->g:I

    iput p7, p0, La/wv20;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/wv20;->a:B

    .line 2
    .line 3
    iget v1, p0, La/wv20;->h:I

    .line 4
    .line 5
    iget v2, p0, La/wv20;->g:I

    .line 6
    .line 7
    iget v3, p0, La/wv20;->f:I

    .line 8
    .line 9
    iget-object v4, p0, La/wv20;->e:La/pu90;

    .line 10
    .line 11
    iget-object v5, p0, La/wv20;->d:La/pu90;

    .line 12
    .line 13
    iget v6, p0, La/wv20;->c:I

    .line 14
    .line 15
    iget-object p0, p0, La/wv20;->b:La/pu90;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    check-cast p1, La/ou90;

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    iget v0, p0, La/pu90;->b:I

    .line 30
    .line 31
    sub-int v0, v1, v0

    .line 32
    .line 33
    div-int/lit8 v0, v0, 0x2

    .line 34
    .line 35
    invoke-virtual {p1, p0, v8, v0, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iget v8, p0, La/pu90;->a:I

    .line 41
    .line 42
    :cond_1
    add-int/2addr v8, v6

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    iget p0, v5, La/pu90;->b:I

    .line 46
    .line 47
    sub-int p0, v1, p0

    .line 48
    .line 49
    div-int/lit8 p0, p0, 0x2

    .line 50
    .line 51
    invoke-virtual {p1, v5, v8, p0, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 52
    .line 53
    .line 54
    :cond_2
    if-eqz v4, :cond_3

    .line 55
    .line 56
    sub-int/2addr v3, v2

    .line 57
    iget p0, v4, La/pu90;->b:I

    .line 58
    .line 59
    sub-int/2addr v1, p0

    .line 60
    div-int/lit8 v1, v1, 0x2

    .line 61
    .line 62
    invoke-virtual {p1, v4, v3, v1, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 63
    .line 64
    .line 65
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p0, v8, v6, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 72
    .line 73
    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1, v5, v8, v3, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 77
    .line 78
    .line 79
    :cond_4
    if-eqz v4, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1, v4, v2, v1, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 82
    .line 83
    .line 84
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
