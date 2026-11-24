.class public final synthetic La/m8n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:B

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILa/x8n;La/mm40;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/m8n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/m8n;->b:La/mm40;

    iput-object p3, p0, La/m8n;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/m8n;->e:Z

    iput p1, p0, La/m8n;->c:I

    iput-byte p2, p0, La/m8n;->d:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ILa/pdz;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/m8n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m8n;->b:La/mm40;

    iput p2, p0, La/m8n;->c:I

    iput-object p3, p0, La/m8n;->f:Ljava/lang/Object;

    iput-byte p4, p0, La/m8n;->d:B

    iput-boolean p5, p0, La/m8n;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(La/ylp0;La/mm40;ZII)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/m8n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m8n;->f:Ljava/lang/Object;

    iput-object p2, p0, La/m8n;->b:La/mm40;

    iput-boolean p3, p0, La/m8n;->e:Z

    iput p4, p0, La/m8n;->c:I

    iput-byte p5, p0, La/m8n;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/m8n;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/m8n;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La/ylp0;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    check-cast v4, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget p1, p0, La/m8n;->c:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iget-object v2, p0, La/m8n;->b:La/mm40;

    .line 28
    .line 29
    iget-boolean v3, p0, La/m8n;->e:Z

    .line 30
    .line 31
    iget-byte v6, p0, La/m8n;->d:B

    .line 32
    .line 33
    invoke-static/range {v1 .. v6}, La/xcm0;->c(La/ylp0;La/mm40;ZLa/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    iget-object v0, p0, La/m8n;->f:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    check-cast v3, La/pdz;

    .line 43
    .line 44
    move-object v4, p1

    .line 45
    check-cast v4, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-byte p1, p0, La/m8n;->d:B

    .line 53
    .line 54
    or-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, La/x8x;->L(I)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    iget-object v1, p0, La/m8n;->b:La/mm40;

    .line 61
    .line 62
    iget v2, p0, La/m8n;->c:I

    .line 63
    .line 64
    iget-boolean v6, p0, La/m8n;->e:Z

    .line 65
    .line 66
    invoke-static/range {v1 .. v6}, La/i4w0;->J(La/mm40;ILa/pdz;La/fet;II)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    iget-object v0, p0, La/m8n;->f:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v2, v0

    .line 75
    check-cast v2, La/x8n;

    .line 76
    .line 77
    move-object v4, p1

    .line 78
    check-cast v4, La/fet;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget p1, p0, La/m8n;->c:I

    .line 86
    .line 87
    or-int/lit8 p1, p1, 0x1

    .line 88
    .line 89
    invoke-static {p1}, La/x8x;->L(I)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    iget-object v1, p0, La/m8n;->b:La/mm40;

    .line 94
    .line 95
    iget-boolean v3, p0, La/m8n;->e:Z

    .line 96
    .line 97
    iget-byte v6, p0, La/m8n;->d:B

    .line 98
    .line 99
    invoke-static/range {v1 .. v6}, La/p8n;->b(La/mm40;La/x8n;ZLa/fet;II)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
