.class public final synthetic La/otm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/y1m;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/y1m;Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    const/4 p5, 0x2

    iput-byte p5, p0, La/otm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/otm;->b:La/mm40;

    iput-object p2, p0, La/otm;->d:La/y1m;

    iput-object p3, p0, La/otm;->c:Ljava/lang/String;

    iput-boolean p4, p0, La/otm;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/y1m;ZIB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/otm;->a:B

    iput-object p1, p0, La/otm;->b:La/mm40;

    iput-object p2, p0, La/otm;->c:Ljava/lang/String;

    iput-object p3, p0, La/otm;->d:La/y1m;

    iput-boolean p4, p0, La/otm;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/otm;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v4, p1

    .line 8
    check-cast v4, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, La/otm;->d:La/y1m;

    .line 20
    .line 21
    iget-object v5, p0, La/otm;->b:La/mm40;

    .line 22
    .line 23
    iget-object v6, p0, La/otm;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v7, p0, La/otm;->e:Z

    .line 26
    .line 27
    invoke-static/range {v2 .. v7}, La/qbc;->b(ILa/y1m;La/fet;La/mm40;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v2, p1

    .line 34
    check-cast v2, La/fet;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, La/x8x;->L(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object v1, p0, La/otm;->d:La/y1m;

    .line 46
    .line 47
    iget-object v3, p0, La/otm;->b:La/mm40;

    .line 48
    .line 49
    iget-object v4, p0, La/otm;->c:Ljava/lang/String;

    .line 50
    .line 51
    iget-boolean v5, p0, La/otm;->e:Z

    .line 52
    .line 53
    invoke-static/range {v0 .. v5}, La/tlb;->b(ILa/y1m;La/fet;La/mm40;Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    move-object v2, p1

    .line 60
    check-cast v2, La/fet;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, La/x8x;->L(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v1, p0, La/otm;->d:La/y1m;

    .line 72
    .line 73
    iget-object v3, p0, La/otm;->b:La/mm40;

    .line 74
    .line 75
    iget-object v4, p0, La/otm;->c:Ljava/lang/String;

    .line 76
    .line 77
    iget-boolean v5, p0, La/otm;->e:Z

    .line 78
    .line 79
    invoke-static/range {v0 .. v5}, La/slb;->d(ILa/y1m;La/fet;La/mm40;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
