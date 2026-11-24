.class public final La/znc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:I

.field public synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/znc;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/znc;->i:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    check-cast p2, La/wmm0;

    .line 14
    .line 15
    check-cast p3, La/yje;

    .line 16
    .line 17
    new-instance p1, La/znc;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, v0, p3, v1}, La/znc;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput p0, p1, La/znc;->j:I

    .line 24
    .line 25
    iput-object p2, p1, La/znc;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p1, p0}, La/znc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    check-cast p3, La/yje;

    .line 43
    .line 44
    new-instance p2, La/znc;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {p2, v0, p3, v1}, La/znc;-><init>(ILa/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p2, La/znc;->k:Ljava/lang/Object;

    .line 51
    .line 52
    iput p0, p2, La/znc;->j:I

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    invoke-virtual {p2, p0}, La/znc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/znc;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v9, v0, La/znc;->j:I

    .line 9
    .line 10
    iget-object v0, v0, La/znc;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/wmm0;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/jqg;

    .line 20
    .line 21
    iget-wide v3, v0, La/wmm0;->a:J

    .line 22
    .line 23
    iget-wide v5, v0, La/wmm0;->b:J

    .line 24
    .line 25
    iget-wide v7, v0, La/wmm0;->c:J

    .line 26
    .line 27
    iget-wide v10, v0, La/wmm0;->d:J

    .line 28
    .line 29
    iget-wide v12, v0, La/wmm0;->e:J

    .line 30
    .line 31
    iget-wide v14, v0, La/wmm0;->f:J

    .line 32
    .line 33
    iget-object v1, v0, La/wmm0;->g:La/o4i0;

    .line 34
    .line 35
    iget-object v0, v0, La/wmm0;->h:La/hyx;

    .line 36
    .line 37
    move-object/from16 v17, v0

    .line 38
    .line 39
    move-object/from16 v16, v1

    .line 40
    .line 41
    invoke-direct/range {v2 .. v17}, La/jqg;-><init>(JJJIJJJLa/o4i0;La/hyx;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :pswitch_0
    iget-object v1, v0, La/znc;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/List;

    .line 48
    .line 49
    iget v0, v0, La/znc;->j:I

    .line 50
    .line 51
    sget-object v2, La/wne;->a:La/wne;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-le v1, v0, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v0, v1

    .line 64
    :goto_0
    new-instance v1, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
