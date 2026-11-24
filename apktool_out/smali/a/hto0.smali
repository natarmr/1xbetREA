.class public final synthetic La/hto0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ito0;


# direct methods
.method public synthetic constructor <init>(La/ito0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hto0;->a:B

    iput-object p1, p0, La/hto0;->b:La/ito0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/hto0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hto0;->b:La/ito0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/ito0;->c()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, La/ito0;->d:La/snf0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/ito0;->c()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
