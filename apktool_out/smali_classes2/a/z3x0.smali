.class public final La/z3x0;
.super Ljava/security/spec/EncodedKeySpec;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>([BB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z3x0;->a:B

    invoke-direct {p0, p1}, Ljava/security/spec/EncodedKeySpec;-><init>([B)V

    return-void
.end method


# virtual methods
.method public final getFormat()Ljava/lang/String;
    .locals 0

    .line 1
    iget-byte p0, p0, La/z3x0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "raw"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "raw"

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
