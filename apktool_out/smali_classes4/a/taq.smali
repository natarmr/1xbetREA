.class public final synthetic La/taq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ebq;


# direct methods
.method public synthetic constructor <init>(La/ebq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/taq;->a:B

    iput-object p1, p0, La/taq;->b:La/ebq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/taq;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/taq;->b:La/ebq;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 11
    .line 12
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 22
    .line 23
    move-object v4, v2

    .line 24
    check-cast v4, La/oaq;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x7ff

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    invoke-static/range {v4 .. v17}, La/oaq;->a(La/oaq;Ljava/util/List;ZLjava/lang/Integer;La/g9q;La/eb8;La/kcq;La/cev;ZZILa/wbq;ZI)La/oaq;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    sget-object v1, La/kaq;->a:La/kaq;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
