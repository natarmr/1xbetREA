.class public final synthetic La/ytl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/pz40;

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:La/pz40;

.field public final synthetic h:F

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(La/xdr;La/xdr;La/pz40;FZLa/pz40;FJB)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/ytl0;->a:B

    iput-object p1, p0, La/ytl0;->b:La/xdr;

    iput-object p2, p0, La/ytl0;->c:La/xdr;

    iput-object p3, p0, La/ytl0;->d:La/pz40;

    iput p4, p0, La/ytl0;->e:F

    iput-boolean p5, p0, La/ytl0;->f:Z

    iput-object p6, p0, La/ytl0;->g:La/pz40;

    iput p7, p0, La/ytl0;->h:F

    iput-wide p8, p0, La/ytl0;->i:J

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
    iget-byte v1, v0, La/ytl0;->a:B

    .line 4
    .line 5
    const-string v2, "TOTAL_CONTENT_ID"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/high16 v5, 0x41000000    # 8.0f

    .line 10
    .line 11
    iget v6, v0, La/ytl0;->e:F

    .line 12
    .line 13
    iget-object v7, v0, La/ytl0;->d:La/pz40;

    .line 14
    .line 15
    iget-object v8, v0, La/ytl0;->c:La/xdr;

    .line 16
    .line 17
    iget-object v9, v0, La/ytl0;->b:La/xdr;

    .line 18
    .line 19
    sget-object v10, La/jm40;->b:La/jm40;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    if-nez v9, :cond_0

    .line 25
    .line 26
    if-nez v8, :cond_0

    .line 27
    .line 28
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    :cond_0
    new-instance v11, La/dul0;

    .line 35
    .line 36
    const/16 v17, 0x1

    .line 37
    .line 38
    iget-boolean v12, v0, La/ytl0;->f:Z

    .line 39
    .line 40
    iget-object v13, v0, La/ytl0;->g:La/pz40;

    .line 41
    .line 42
    iget v14, v0, La/ytl0;->h:F

    .line 43
    .line 44
    iget-wide v0, v0, La/ytl0;->i:J

    .line 45
    .line 46
    move-wide v15, v0

    .line 47
    invoke-direct/range {v11 .. v17}, La/dul0;-><init>(ZLa/pz40;FJB)V

    .line 48
    .line 49
    .line 50
    invoke-static {v10, v11}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, La/qmk;->a:La/zcl;

    .line 55
    .line 56
    invoke-static {v0, v5, v4, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    :cond_1
    invoke-static {v10, v6}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_0
    if-nez v9, :cond_2

    .line 70
    .line 71
    if-nez v8, :cond_2

    .line 72
    .line 73
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    :cond_2
    new-instance v11, La/dul0;

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    iget-boolean v12, v0, La/ytl0;->f:Z

    .line 84
    .line 85
    iget-object v13, v0, La/ytl0;->g:La/pz40;

    .line 86
    .line 87
    iget v14, v0, La/ytl0;->h:F

    .line 88
    .line 89
    iget-wide v0, v0, La/ytl0;->i:J

    .line 90
    .line 91
    move-wide v15, v0

    .line 92
    invoke-direct/range {v11 .. v17}, La/dul0;-><init>(ZLa/pz40;FJB)V

    .line 93
    .line 94
    .line 95
    invoke-static {v10, v11}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget-object v1, La/qmk;->a:La/zcl;

    .line 100
    .line 101
    invoke-static {v0, v5, v4, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    :cond_3
    invoke-static {v10, v6}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
