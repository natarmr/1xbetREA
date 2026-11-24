.class public final synthetic La/rlg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/luu;


# direct methods
.method public synthetic constructor <init>(La/luu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rlg;->a:B

    iput-object p1, p0, La/rlg;->b:La/luu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/rlg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rlg;->b:La/luu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/luu;->a:La/nok0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/nok0;->a()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/lok0;

    .line 40
    .line 41
    iget v1, v1, La/lok0;->a:I

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 52
    .line 53
    new-instance v1, La/mll0;

    .line 54
    .line 55
    const-string v2, ""

    .line 56
    .line 57
    invoke-direct {v1, v2, v0, p0}, La/mll0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_0
    new-instance v3, La/wlg;

    .line 62
    .line 63
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;

    .line 64
    .line 65
    sget-object v5, La/iun;->a:La/iun;

    .line 66
    .line 67
    new-instance v7, La/ls2;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, La/luu;->a:La/nok0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/nok0;->a()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    move-object v6, v5

    .line 79
    invoke-direct/range {v3 .. v8}, La/wlg;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;Ljava/util/List;Ljava/util/List;La/ms2;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
