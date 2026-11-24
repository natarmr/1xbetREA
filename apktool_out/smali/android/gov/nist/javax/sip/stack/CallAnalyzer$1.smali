.class Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->startAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

.field final synthetic val$metricReference:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

.field final synthetic val$statInfo:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$statInfo:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$metricReference:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$statInfo:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->lastLoggedEventTime:Ljava/lang/Long;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    sub-long/2addr v1, v3

    .line 14
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$statInfo:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 15
    .line 16
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 17
    .line 18
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->minimumDumpInterval:Ljava/lang/Long;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    cmp-long v0, v1, v3

    .line 25
    .line 26
    if-lez v0, :cond_4

    .line 27
    .line 28
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 29
    .line 30
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->access$000(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;)Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/util/HashMap;

    .line 59
    .line 60
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$metricReference:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Long;

    .line 67
    .line 68
    const-wide/high16 v3, -0x8000000000000000L

    .line 69
    .line 70
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v2, v5}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_0

    .line 79
    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    sub-long/2addr v5, v7

    .line 89
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-eqz v2, :cond_0

    .line 94
    .line 95
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$statInfo:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 96
    .line 97
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 98
    .line 99
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->stuckTimeBeforeDump:Ljava/lang/Long;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    cmp-long v2, v5, v7

    .line 106
    .line 107
    if-lez v2, :cond_0

    .line 108
    .line 109
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v5, "Offending thread:\n"

    .line 119
    .line 120
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/lang/Thread;

    .line 130
    .line 131
    invoke-virtual {v5, v1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getCurrentStack(Ljava/lang/Thread;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const/16 v1, 0x1388

    .line 151
    .line 152
    new-array v1, v1, [Ljava/lang/Thread;

    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/Thread;->enumerate([Ljava/lang/Thread;)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    const/4 v5, 0x0

    .line 159
    :goto_0
    if-ge v5, v2, :cond_3

    .line 160
    .line 161
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 162
    .line 163
    invoke-static {v6}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->access$000(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;)Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    aget-object v7, v1, v5

    .line 168
    .line 169
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    check-cast v6, Ljava/util/HashMap;

    .line 174
    .line 175
    if-eqz v6, :cond_2

    .line 176
    .line 177
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 178
    .line 179
    invoke-static {v6}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->access$000(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;)Ljava/util/Map;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    aget-object v7, v1, v5

    .line 184
    .line 185
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    check-cast v6, Ljava/util/HashMap;

    .line 190
    .line 191
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->val$metricReference:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 192
    .line 193
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    check-cast v6, Ljava/lang/Long;

    .line 198
    .line 199
    if-eqz v6, :cond_1

    .line 200
    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v7

    .line 205
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 206
    .line 207
    .line 208
    move-result-wide v9

    .line 209
    sub-long/2addr v7, v9

    .line 210
    goto :goto_1

    .line 211
    :cond_1
    const-wide/16 v7, 0x0

    .line 212
    .line 213
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 214
    .line 215
    .line 216
    move-result-wide v9

    .line 217
    cmp-long v6, v9, v3

    .line 218
    .line 219
    if-eqz v6, :cond_2

    .line 220
    .line 221
    new-instance v6, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const-string v9, "->Stuck time:"

    .line 227
    .line 228
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v7, " "

    .line 235
    .line 236
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;->this$0:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 240
    .line 241
    aget-object v8, v1, v5

    .line 242
    .line 243
    invoke-virtual {v7, v8}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getCurrentStack(Ljava/lang/Thread;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 258
    .line 259
    goto :goto_0

    .line 260
    :cond_3
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    .line 270
    .line 271
    :catch_0
    :cond_4
    return-void
.end method
