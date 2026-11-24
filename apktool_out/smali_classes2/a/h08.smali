.class public final synthetic La/h08;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:S

.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILa/mm40;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/h08;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/h08;->e:Ljava/lang/Object;

    iput-object p4, p0, La/h08;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/h08;->b:Z

    iput-short p1, p0, La/h08;->c:S

    iput-byte p2, p0, La/h08;->d:B

    return-void
.end method

.method public synthetic constructor <init>(La/taq0;ZLa/ugd;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/h08;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h08;->e:Ljava/lang/Object;

    iput-boolean p2, p0, La/h08;->b:Z

    iput-object p3, p0, La/h08;->f:Ljava/lang/Object;

    iput-short p4, p0, La/h08;->c:S

    iput-byte p5, p0, La/h08;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/h08;->a:B

    .line 2
    .line 3
    iget-short v1, p0, La/h08;->c:S

    .line 4
    .line 5
    iget-object v2, p0, La/h08;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/h08;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v3

    .line 13
    check-cast v4, La/taq0;

    .line 14
    .line 15
    move-object v6, v2

    .line 16
    check-cast v6, La/ugd;

    .line 17
    .line 18
    move-object v7, p1

    .line 19
    check-cast v7, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p1, v1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    iget-boolean v5, p0, La/h08;->b:Z

    .line 33
    .line 34
    iget-byte v9, p0, La/h08;->d:B

    .line 35
    .line 36
    invoke-static/range {v4 .. v9}, La/dem0;->e(La/taq0;ZLa/ugd;La/fet;II)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast v3, La/mm40;

    .line 43
    .line 44
    move-object v4, v2

    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    check-cast v2, La/fet;

    .line 49
    .line 50
    check-cast p2, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    or-int/lit8 p1, v1, 0x1

    .line 56
    .line 57
    invoke-static {p1}, La/x8x;->L(I)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-byte v1, p0, La/h08;->d:B

    .line 62
    .line 63
    iget-boolean v5, p0, La/h08;->b:Z

    .line 64
    .line 65
    invoke-static/range {v0 .. v5}, La/vbw0;->H(IILa/fet;La/mm40;Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
