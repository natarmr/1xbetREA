.class public final synthetic La/n0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mdm;La/h1z;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/n0z;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n0z;->g:Ljava/lang/Object;

    iput-object p2, p0, La/n0z;->h:Ljava/lang/Object;

    iput p3, p0, La/n0z;->c:I

    iput-boolean p4, p0, La/n0z;->b:Z

    iput-object p5, p0, La/n0z;->d:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La/n0z;->i:Ljava/lang/Object;

    iput-object p7, p0, La/n0z;->e:Lkotlin/jvm/functions/Function0;

    iput p8, p0, La/n0z;->f:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/l7m0;ZLjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/n0z;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n0z;->g:Ljava/lang/Object;

    iput-object p2, p0, La/n0z;->h:Ljava/lang/Object;

    iput-boolean p3, p0, La/n0z;->b:Z

    iput-object p4, p0, La/n0z;->i:Ljava/lang/Object;

    iput p5, p0, La/n0z;->c:I

    iput-object p6, p0, La/n0z;->d:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/n0z;->e:Lkotlin/jvm/functions/Function0;

    iput p8, p0, La/n0z;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/n0z;->a:B

    .line 2
    .line 3
    iget v1, p0, La/n0z;->f:I

    .line 4
    .line 5
    iget-object v2, p0, La/n0z;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/n0z;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/n0z;->g:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, La/mm40;

    .line 16
    .line 17
    move-object v6, v3

    .line 18
    check-cast v6, La/l7m0;

    .line 19
    .line 20
    move-object v8, v2

    .line 21
    check-cast v8, Ljava/lang/String;

    .line 22
    .line 23
    move-object v12, p1

    .line 24
    check-cast v12, La/fet;

    .line 25
    .line 26
    move-object/from16 v0, p2

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    or-int/lit8 v0, v1, 0x1

    .line 34
    .line 35
    invoke-static {v0}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-boolean v7, p0, La/n0z;->b:Z

    .line 40
    .line 41
    iget v9, p0, La/n0z;->c:I

    .line 42
    .line 43
    iget-object v10, p0, La/n0z;->d:Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    iget-object v11, p0, La/n0z;->e:Lkotlin/jvm/functions/Function0;

    .line 46
    .line 47
    invoke-static/range {v5 .. v13}, La/g7x;->r(La/mm40;La/l7m0;ZLjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    move-object v0, v4

    .line 54
    check-cast v0, La/mdm;

    .line 55
    .line 56
    check-cast v3, La/h1z;

    .line 57
    .line 58
    move-object v5, v2

    .line 59
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    move-object v7, p1

    .line 62
    check-cast v7, La/fet;

    .line 63
    .line 64
    move-object/from16 v2, p2

    .line 65
    .line 66
    check-cast v2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    or-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-static {v1}, La/x8x;->L(I)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    iget v2, p0, La/n0z;->c:I

    .line 78
    .line 79
    move-object v1, v3

    .line 80
    iget-boolean v3, p0, La/n0z;->b:Z

    .line 81
    .line 82
    iget-object v4, p0, La/n0z;->d:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    iget-object v6, p0, La/n0z;->e:Lkotlin/jvm/functions/Function0;

    .line 85
    .line 86
    invoke-static/range {v0 .. v8}, La/azw;->x(La/mdm;La/h1z;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
