.class public final synthetic La/jp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pu90;IILa/pu90;IILa/pu90;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/jp2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jp2;->b:La/pu90;

    iput p2, p0, La/jp2;->d:I

    iput p3, p0, La/jp2;->e:I

    iput-object p4, p0, La/jp2;->c:La/pu90;

    iput p5, p0, La/jp2;->f:I

    iput p6, p0, La/jp2;->g:I

    iput-object p7, p0, La/jp2;->j:Ljava/lang/Object;

    iput p8, p0, La/jp2;->h:I

    iput p9, p0, La/jp2;->i:I

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;IIIII[[La/pu90;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/jp2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jp2;->b:La/pu90;

    iput-object p2, p0, La/jp2;->c:La/pu90;

    iput p3, p0, La/jp2;->d:I

    iput p4, p0, La/jp2;->e:I

    iput p5, p0, La/jp2;->f:I

    iput p6, p0, La/jp2;->g:I

    iput p7, p0, La/jp2;->h:I

    iput-object p8, p0, La/jp2;->j:Ljava/lang/Object;

    iput p9, p0, La/jp2;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/jp2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, La/jp2;->i:I

    .line 5
    .line 6
    iget-object v3, p0, La/jp2;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iget v4, p0, La/jp2;->h:I

    .line 9
    .line 10
    iget v5, p0, La/jp2;->g:I

    .line 11
    .line 12
    iget v6, p0, La/jp2;->f:I

    .line 13
    .line 14
    iget v7, p0, La/jp2;->e:I

    .line 15
    .line 16
    iget v8, p0, La/jp2;->d:I

    .line 17
    .line 18
    iget-object v9, p0, La/jp2;->c:La/pu90;

    .line 19
    .line 20
    iget-object p0, p0, La/jp2;->b:La/pu90;

    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v3, [[La/pu90;

    .line 26
    .line 27
    check-cast p1, La/ou90;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1, p0, v0, v0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v9, v8, v0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 37
    .line 38
    .line 39
    move p0, v0

    .line 40
    :goto_0
    if-ge p0, v7, :cond_0

    .line 41
    .line 42
    add-int v9, v6, v5

    .line 43
    .line 44
    add-int v10, v4, v5

    .line 45
    .line 46
    mul-int/2addr v10, p0

    .line 47
    add-int/2addr v10, v9

    .line 48
    aget-object v9, v3, p0

    .line 49
    .line 50
    aget-object v9, v9, v0

    .line 51
    .line 52
    invoke-virtual {p1, v9, v0, v10, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 53
    .line 54
    .line 55
    aget-object v9, v3, p0

    .line 56
    .line 57
    const/4 v11, 0x1

    .line 58
    aget-object v9, v9, v11

    .line 59
    .line 60
    invoke-virtual {p1, v9, v8, v10, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 61
    .line 62
    .line 63
    aget-object v9, v3, p0

    .line 64
    .line 65
    const/4 v11, 0x2

    .line 66
    aget-object v9, v9, v11

    .line 67
    .line 68
    invoke-virtual {p1, v9, v2, v10, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 p0, p0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_0
    check-cast v3, La/pu90;

    .line 78
    .line 79
    check-cast p1, La/ou90;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p0, v8, v7, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v9, v6, v5, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v3, v4, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
