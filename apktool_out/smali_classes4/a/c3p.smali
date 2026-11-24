.class public final synthetic La/c3p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g2v;


# direct methods
.method public synthetic constructor <init>(La/g2v;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c3p;->a:B

    iput-object p1, p0, La/c3p;->b:La/g2v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c3p;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v3, La/pb10;->g:La/pb10;

    .line 9
    .line 10
    const-wide/16 v13, 0x0

    .line 11
    .line 12
    const/16 v15, 0x3de

    .line 13
    .line 14
    iget-object v2, v0, La/c3p;->b:La/g2v;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const v8, 0x7f130677

    .line 21
    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const-wide/16 v11, 0x0

    .line 26
    .line 27
    invoke-static/range {v2 .. v15}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_0
    new-instance v1, La/h4p0;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    sget-object v5, La/iun;->a:La/iun;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    const/4 v3, 0x0

    .line 39
    iget-object v6, v0, La/c3p;->b:La/g2v;

    .line 40
    .line 41
    invoke-direct/range {v1 .. v6}, La/h4p0;-><init>(ZZZLjava/util/List;La/g2v;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :pswitch_1
    sget-object v3, La/pb10;->g:La/pb10;

    .line 46
    .line 47
    const-wide/16 v13, 0x0

    .line 48
    .line 49
    const/16 v15, 0x25e

    .line 50
    .line 51
    iget-object v2, v0, La/c3p;->b:La/g2v;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const v8, 0x7f130677

    .line 58
    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const v10, 0x7f131690

    .line 62
    .line 63
    .line 64
    const-wide/16 v11, 0x2710

    .line 65
    .line 66
    invoke-static/range {v2 .. v15}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 67
    .line 68
    .line 69
    move-result-object v20

    .line 70
    const/16 v15, 0x3de

    .line 71
    .line 72
    const v8, 0x7f130781

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    const-wide/16 v11, 0x0

    .line 77
    .line 78
    invoke-static/range {v2 .. v15}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 79
    .line 80
    .line 81
    move-result-object v21

    .line 82
    sget-object v22, La/iun;->a:La/iun;

    .line 83
    .line 84
    new-instance v16, La/w2p;

    .line 85
    .line 86
    const/16 v19, 0x0

    .line 87
    .line 88
    const/16 v23, 0x0

    .line 89
    .line 90
    const/16 v17, 0x1

    .line 91
    .line 92
    const/16 v18, 0x1

    .line 93
    .line 94
    invoke-direct/range {v16 .. v23}, La/w2p;-><init>(ZZZLa/mdm;La/mdm;Ljava/util/List;La/wcb;)V

    .line 95
    .line 96
    .line 97
    return-object v16

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
