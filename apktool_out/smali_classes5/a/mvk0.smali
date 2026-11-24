.class public final synthetic La/mvk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ovk0;


# direct methods
.method public synthetic constructor <init>(La/ovk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mvk0;->a:B

    iput-object p1, p0, La/mvk0;->b:La/ovk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mvk0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/mvk0;->b:La/ovk0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/mdm;

    .line 11
    .line 12
    sget-object v1, La/pb10;->c:La/xuz;

    .line 13
    .line 14
    sget-object v3, La/pb10;->g:La/pb10;

    .line 15
    .line 16
    invoke-virtual {v0}, La/ovk0;->a()La/fee;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/ttk0;

    .line 25
    .line 26
    iget v0, v0, La/ttk0;->t:I

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const-wide/16 v13, 0x0

    .line 36
    .line 37
    const/16 v15, 0x25e

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const v8, 0x7f1305c0

    .line 44
    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    const v10, 0x7f131111

    .line 48
    .line 49
    .line 50
    const-wide/16 v11, 0x2710

    .line 51
    .line 52
    invoke-direct/range {v2 .. v15}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :pswitch_0
    new-instance v3, La/mdm;

    .line 57
    .line 58
    sget-object v1, La/pb10;->c:La/xuz;

    .line 59
    .line 60
    sget-object v2, La/pb10;->g:La/pb10;

    .line 61
    .line 62
    invoke-virtual {v0}, La/ovk0;->a()La/fee;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/ttk0;

    .line 71
    .line 72
    iget v0, v0, La/ttk0;->t:I

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const-wide/16 v14, 0x0

    .line 82
    .line 83
    const/16 v16, 0x25e

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x0

    .line 89
    const v9, 0x7f1307c4

    .line 90
    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    const v11, 0x7f131690

    .line 94
    .line 95
    .line 96
    const-wide/16 v12, 0x2710

    .line 97
    .line 98
    invoke-direct/range {v3 .. v16}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 99
    .line 100
    .line 101
    return-object v3

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
