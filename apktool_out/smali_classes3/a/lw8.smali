.class public final synthetic La/lw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jw8;


# direct methods
.method public synthetic constructor <init>(La/jw8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lw8;->a:B

    iput-object p1, p0, La/lw8;->b:La/jw8;

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
    iget-byte v1, v0, La/lw8;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/lw8;->b:La/jw8;

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
    iget v0, v0, La/jw8;->c:I

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-wide/16 v13, 0x0

    .line 26
    .line 27
    const/16 v15, 0x25e

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const v8, 0x7f1307c4

    .line 34
    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    const v10, 0x7f131690

    .line 38
    .line 39
    .line 40
    const-wide/16 v11, 0x2710

    .line 41
    .line 42
    invoke-direct/range {v2 .. v15}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :pswitch_0
    new-instance v3, La/mdm;

    .line 47
    .line 48
    sget-object v1, La/pb10;->c:La/xuz;

    .line 49
    .line 50
    sget-object v2, La/pb10;->g:La/pb10;

    .line 51
    .line 52
    iget v0, v0, La/jw8;->c:I

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    const-wide/16 v14, 0x0

    .line 62
    .line 63
    const/16 v16, 0x3de

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const v9, 0x7f130674

    .line 70
    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const-wide/16 v12, 0x0

    .line 75
    .line 76
    invoke-direct/range {v3 .. v16}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
